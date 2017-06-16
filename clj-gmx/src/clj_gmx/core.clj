(ns clj_gmx.core
  (:gen-class)
  (:require [instaparse.core :as insta])
  (:use 
  	[clj_gmx.parsers :as parsers]
  	[clj_gmx.util :as util]
  	[clj_gmx.gmx :as gmx]))

(defn -main
  ([inFile xOffset yOffset outFile]
    (spit outFile
      (str
        gmx/room-start
        (util/seq2str 
          (parsers/eval-jmap
            inFile
            (read-string xOffset)
            (read-string yOffset)))
        gmx/room-end)))
  ([config outFile]
    (spit outFile
      (str
        gmx/room-start
        (util/seq2str
          (parsers/eval-config config))
        gmx/room-end)))
  ([]
      (println "GUI not implemented yet...")))
