(ns p029.core
  (:gen-class))

(def squares
  (for [a (range 2 101)
        b (range 2 101)]
    (Math/pow a b)))

(defn -main [& _]
  (println (count (distinct squares))))