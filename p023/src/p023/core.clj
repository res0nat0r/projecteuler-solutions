(ns p023.core)

(defn factor? [n d]
  (zero? (rem n d)))

(defn factors [n]
  (filter #(factor? n %) (range 1 n)))

(defn sum-factors [n]
  (apply + (factors n)))

(defn abundant? [n]
  (> (sum-factors n) n))

(def all-abundant
  (filter #(abundant? %) (range 1 28124)))

(def all-abundant-pairs
  (->> (for [x all-abundant y all-abundant
      :let [xy (+ x y)]
      :when (< xy 28124)]
       xy)
       (distinct)))

(defn -main [& _]
  (print
    (-
      (reduce + (range 1 28124))
      (reduce + all-abundant-pairs))))
