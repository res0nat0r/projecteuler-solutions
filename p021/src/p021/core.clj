(ns p021.core
  (:gen-class))

(defn factor? [n d]
  (zero? (rem n d)))

(defn factors [n]
  (filter #(factor? n %) (range 1 n)))

(defn d [n]
  (apply + (factors n)))

(defn amicable? [a]
  (let [d_a   (d a)
        d_d_a (d d_a)]
    (and
      (not= d_a a)
      (== d_d_a a))))

(defn -main [& _]
  (println (apply + (filter #(amicable? %) (range 10000)))))
