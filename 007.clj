; What is the 10 001st prime number?

(defn factor? [n d]
    (zero? (rem n d)))

(defn factors [n]
    (filter #(factor? n %) (range 2 n)))

(defn prime? [n]
    (empty? (factors n)))

(nth (filter prime? (range)) 10002)
