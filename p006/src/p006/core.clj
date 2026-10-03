; Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

(ns p006.core
  (:gen-class))

(defn sum-of-squares [n]
  (apply + (map #(* % %) (range 1 (+ n 1)))))

(defn square-of-sum [n]
  (*
    (apply + (map #(+ %) (range 1 (+ n 1))))
    (apply + (map #(+ %) (range 1 (+ n 1))))))

(defn -main [& _]
  (println (- (square-of-sum 100) (sum-of-squares 100))))
