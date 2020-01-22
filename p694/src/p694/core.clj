(ns p694.core
  (:gen-class))

(defn factor? [n d]
  (zero? (rem n d)))

(defn factors [n]
  (filter #(factor? n %) (range 2 n)))

(defn prime? [n]
  (empty? (factors n)))

(defn prime-factors [n]
  (filter #(prime? %) (factors n)))