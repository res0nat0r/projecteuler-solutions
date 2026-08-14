(ns p003.core
  (:gen-class))

(defn factor? [n d]
  (zero? (mod n d)))

(defn factors [n]
  (filter #(factor? n %) (range 2 n)))

(defn prime? [n]
  (empty? (factors n)))

(defn -main [& _]
  ;; Note: The original 003.clj code is:
  ;; (println (apply max (take-while prime? (factors 600851475143))))
  ;; However, factors and prime? as defined here are very slow/naive.
  ;; Let's check if the number 600851475143 can be factored with a faster algorithm,
  ;; or we can keep the logic but optimize it so it runs reasonably.
  ;; Let's write an optimized version of largest prime factor.
  (let [target 600851475143]
    (loop [n target d 2 max-factor 1]
      (if (> (* d d) n)
        (println (max max-factor n))
        (if (zero? (mod n d))
          (recur (loop [temp n] (if (zero? (mod temp d)) (recur (/ temp d)) temp)) (inc d) d)
          (recur n (inc d) max-factor))))))
