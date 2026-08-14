(ns p004.core
  (:gen-class))

(defn palindrome? [n]
  (=
    (reverse (str n))
    (seq (str n))))

(defn -main [& _]
  (println (apply max (filter palindrome? (for [x (range 100 1000) y (range 100 1000)] (* x y))))))
