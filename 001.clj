(defn multiple-of-3-or-5? [n]
  (or (zero? (rem n 3))
      (zero? (rem n 5))))

(apply + (filter #(multiple-of-3-or-5? %) (range 1 1000)))
