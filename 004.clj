; Find the largest palindrome made from the product of two 3-digit numbers.

(defn palindrome? [n]
  (= 
    (reverse (str n)) 
    (seq (str n))))

(apply max (filter palindrome? (for [x (range 100 1000) y (range 100 1000)] (* x y))))
