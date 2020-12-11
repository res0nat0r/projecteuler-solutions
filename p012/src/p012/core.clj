(ns p012.core
  (:gen-class))

(defn factor? [n d]
  (zero? (rem n d)))

(def factors
  (memoize
    (fn [n]
      (filter #(factor? n %) (range 1 (inc n))))))

(defn triangle [n]
  (apply +' (range (inc n))))

(defn triangle-factors' [n]
  (factors (triangle n)))

(def triangle-factors
  (memoize 
    (fn [n]
      (triangle-factors' n))))
           


(defn -main [& _]
  (def a (apply max (map #(count (triangle-factors %)) (range 10000))))
  (print a))









;  (def a (map #(triangle-factors %) (range)))
