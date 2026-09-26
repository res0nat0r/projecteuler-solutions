; What is the 10 001st prime number?

(ns p007.core
  (:gen-class))

(defn factor? [n d]
    (zero? (rem n d)))

(defn factors [n]
    (filter #(factor? n %) (range 2 n)))

(defn prime? [n]
    (empty? (factors n)))

(defn -main [& _]
  (println (nth (filter prime? (range)) 10002)))
