(defn factor? [n d]
  (zero? (mod n d)))

(defn factors-upto-20? [n]
  (= 
    (count (filter #(factor? n %) (range 1 21))) 
    20))

(println (nth (filter #(factors-upto-20? %) (range)) 1))
