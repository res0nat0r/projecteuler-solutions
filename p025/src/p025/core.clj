(ns p025.core)

(def fib
  (lazy-cat [0 1] (map +' fib (rest fib)))
)

(defn -main [& _]
  (print (count (take-while #(> 1000 (count (str %))) fib)))
)
