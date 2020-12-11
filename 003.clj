; What is the largest prime factor of the number 600851475143 ?

(defn factor? [n d]
  (zero? (mod n d)))

(defn factors [n]
  (filter #(factor? n %) (range 2 n)))

(defn prime? [n]
  (empty? (factors n)))

(println (apply max (take-while prime? (factors 600851475143))))
