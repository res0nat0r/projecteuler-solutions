(ns p025.core)

(def fib
  (lazy-cat [0.0 1.0] (map + fib (rest fib))))

  (println (take 11 fib))
