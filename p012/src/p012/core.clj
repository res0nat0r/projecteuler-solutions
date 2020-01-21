(ns p012.core)

(defn factor? [n d]
  (zero? (rem n d)))

(def factors
  (memoize
    (fn [n]
      (filter #(factor? n %) (range 1 (inc n))))))

(defn triangle [n]
  (apply + (range (inc n))))

(defn triangle-factors [n]
  (factors (triangle n)))

(defn -main [& _]
  (last (take-while (partial > 500) (map #(count (triangle-factors %)) (range)))))
