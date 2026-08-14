(ns p005.core
  (:gen-class))

(defn gcd [a b]
  (if (zero? b)
    a
    (recur b (mod a b))))

(defn lcm [a b]
  (/ (* a b) (gcd a b)))

(defn -main [& _]
  ;; Original code is extremely slow: (println (nth (filter #(factors-upto-20? %) (range)) 1))
  ;; Using LCM is mathematically identical and runs instantaneously.
  (println (reduce lcm (range 1 21))))
