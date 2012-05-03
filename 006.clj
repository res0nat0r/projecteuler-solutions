(defn sum-of-squares [n]
  (apply + (map #(* % %) (range 1 (+ n 1)))))

(defn square-of-sum [n]
  (*
    (apply + (map #(+ %) (range 1 (+ n 1))))
    (apply + (map #(+ %) (range 1 (+ n 1))))))

(println (- (square-of-sum 100) (sum-of-squares 100)))
