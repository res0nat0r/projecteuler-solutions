(ns p018.core
  (:gen-class))

(require '[clojure.string :as str])


(def triangle (with-open [rdr (clojure.java.io/reader "resources/triangle")]
                (reduce conj [] (line-seq rdr))))



(def parse-triangle
  (for [t triangle]
    (->>
      (str/split t #" ")
      (filter not-empty))))



