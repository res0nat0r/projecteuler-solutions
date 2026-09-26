; What is the largest prime factor of the number 600851475143 ?

(ns p003.core
  (:gen-class))

(defn factor? [n d]
  (zero? (mod n d)))

(defn factors [n]
  (filter #(factor? n %) (range 2 n)))

(defn prime? [n]
  (empty? (factors n)))

(defn -main [& _]
  (println (apply max (take-while prime? (factors 600851475143)))))
