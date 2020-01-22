(ns p694.core
  (:gen-class))

(defn factor? [n d]
  (zero? (mod n d)))

(def factors
  (memoize
    (fn [n]
      (filter #(factor? n %) (range 2 (bigint (Math/sqrt (inc n))))))))

(defn prime? [n]
  (empty? (factors n)))

(defn prime-factors [n]
  (filter #(prime? %) (factors n)))



