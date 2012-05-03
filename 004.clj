(defn palindrome? [n]
  (= 
    (reverse (str n)) 
    (seq (str n))))

(println (apply max (filter palindrome?  (map #(* %1 %2) (range 100 1000) (range 100 1000)))))
