(ns clj_gmx.parsers
  (:require 
    [instaparse.core :as insta]
    [instaparse.failure :as fail])
  (:use 
    [clj_gmx.util :as util]
    [clj_gmx.gmx :as gmx]))

(def parse-config
  (insta/parser
    "<S> = Line+
    Line = File Num Num
    <File> = #'[a-zA-Z0-9./]+'
    <Num> = #'[0-9]+' | #'-[0-9]+'"
    :auto-whitespace :standard))

(def parse-config2
  (insta/parser
    "<S> = Grouping+
    Grouping = <'room:'> OutFile Line+
    OutFile = #'[a-zA-Z0-9./]+'
    Line = File Num Num
    <File> = #'[a-zA-Z0-9./]+'
    <Num> = #'[0-9]+' | #'-[0-9]+'"
    :auto-whitespace :standard))

(def parse-jmap
  (insta/parser
    "<S> = Args+
    Args = num num num
    <num> = #'-[0-9]+' | #'[0-9]+'"
    :auto-whitespace :standard))

;; As far as I know, not all jtool versions kept the sections of the
;; serialized rooms in the same order.
;; To deal with this issue, this function goes through the contents
;; line-by-line until it reaches a line that is accepted by the parser.
;; This should work for jmaps created on all versions of jtool from
;; after the initial release.
;; If the file is too old and does not contain the proper section,
;; this will probably break.
(defn linebyline-jmap [s n]
  (if 
    (insta/failure? 
      (parse-jmap 
        (fail/get-line n s) 
        :total true))
    (linebyline-jmap s (+ n 1))
    (parse-jmap 
        (fail/get-line n s))))

(defn eval-jmap [s xOffset yOffset]
  (insta/transform
    {:Args
      (fn [a b c]
        (format gmx/instance-format
          (gmx/obj-name c)
          (+ xOffset (read-string a))
          (+ yOffset (read-string b))
          (System/nanoTime)))}
    (linebyline-jmap (slurp s) 0)))

(defn eval-config [s]
  (insta/transform 
    {:Line
      (fn [a b c]
        (util/seq2str
          (eval-jmap a (read-string b) (read-string c))))}
    (parse-config (slurp s))))

(defn eval-config2 [s]
  (println "not implemented yet"))
