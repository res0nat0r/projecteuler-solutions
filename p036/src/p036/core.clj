(ns p036.core
  (:gen-class))

(defn palindrome? [num]
  (and
    (= (Integer/toString num 10)
       (apply str (reverse (Integer/toString num 10))))

    (= (Integer/toString num 2)
       (apply str (reverse (Integer/toString num 2))))))

(defn -main [& _]
  (println (apply + (filter #(palindrome? %) (range 1000000)))))
