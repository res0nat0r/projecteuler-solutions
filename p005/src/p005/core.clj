; What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

(ns p005.core
  (:gen-class))

(defn factor? [n d]
  (zero? (mod n d)))

(defn factors-upto-20? [n]
  (= 
    (count (filter #(factor? n %) (range 1 21))) 
    20))

(defn -main [& _]
  (println (nth (filter #(factors-upto-20? %) (range)) 1)))
