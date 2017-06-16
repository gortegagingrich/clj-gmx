(ns clj_gmx.util)

(defn seq2str
  ([s n]
    (if (< n (count s))
      (str
        (nth s n)
        (seq2str s (+ n 1)))))
  ([s] (seq2str s 0)))