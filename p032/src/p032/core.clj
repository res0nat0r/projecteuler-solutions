(ns p032.core
  (:gen-class))

(defn digits [n]
  (->> n str (map (comp read-string str))))

(defn pandigital? [n]
  (let [length-n (count (str n))
        digits-of-n (digits n)
        digits-1-to-n (set (range 1 (inc length-n)))]
    (every? digits-1-to-n digits-of-n)))

