; By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

(defn fib [n]
  (if (= n 0) 0
  (if (= n 1) 1
  (+ (fib (- n 1)) (fib (- n 2))))))

(println (apply + (filter even? (take-while #(< % 4000000) (map #(fib %) (range 1 35))))))
