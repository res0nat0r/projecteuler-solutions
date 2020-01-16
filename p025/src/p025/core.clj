(ns p025.core)

(def fib
  (lazy-cat [0.0 1.0] (map + fib (rest fib))))

(println (take 30 fib))

(println (map #(format "%.0f" %) (take 30 fib)))



(println (map #(count (str (format "%.0f" %))) (take 30 fib)))
