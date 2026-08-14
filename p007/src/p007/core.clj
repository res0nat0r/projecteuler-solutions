(ns p007.core
  (:gen-class))

(defn prime? [n]
  (and (> n 1)
       (not-any? #(zero? (rem n %)) (take-while #(<= (* % %) n) (range 2 n)))))

(defn -main [& _]
  ;; Original code is extremely slow: (println (nth (filter prime? (range)) 10002))
  ;; Using a faster prime? check and starting from 2, we can get the 10001st prime (index 10000).
  ;; Let's verify standard 10001st prime is 104743.
  (println (nth (filter prime? (iterate inc 2)) 10000)))
