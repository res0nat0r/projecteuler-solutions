(ns p012.core)

(defn factor? [n d]
  (zero? (rem n d)))

(defn factors [n]
  (filter #(factor? n %) (range 1 (inc n))))

(defn triangle [n]
  (apply + (range (inc n))))

(def triangle-factors
  (let [n          (range)
        triangle-n (map #(triangle %) n)]
    (triangle-n)))
