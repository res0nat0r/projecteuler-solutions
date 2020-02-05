(ns p002.core
  (:gen-class))

(def fib
  (lazy-cat [0 1] (map + (rest fib) fib)))

(defn -main [& _]
  (println
    (->> fib
         (take-while #(< % 4000000))
         (filter even?)
         (apply +))))
