(ns p694.core
  (:gen-class))

(defn factor? [n d]
  (zero? (mod n d)))

(def factors
  (memoize
    (fn [n]
      (filter #(factor? n %) (range 1 (inc n))))))

(defn prime? [n]
  (= 2 (count (factors n))))

(defn prime-factors [n]
  (filter prime?  (take-while (partial > (int (Math/sqrt n))) (factors n))))



