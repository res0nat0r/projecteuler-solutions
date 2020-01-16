(ns p025.core)

(def fib
  (lazy-cat [0.0 1.0] (map + fib (rest fib))))
;
;(println (take 30 fib))
;
;(println (map #(format "%.0f" %) (take 30 fib)))
;
;
;
;(println (map #(count (str (format "%.0f" %))) (take 30 fib)))

(defn -main [& _]
  ; (println (last (take-while #(<= % 1000) (map #(count (str (format "%.0f" %))) fib))))

  (println (map #(format "%.0f" %) (take 10 fib)))
)
