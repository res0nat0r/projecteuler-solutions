(ns p012.core
  (:gen-class))

(defn factor? [n d]
  (zero? (rem n d)))

(def factors
  (memoize
    (fn [n]
      (filter #(factor? n %) (range 1 (inc n))))))

(def triangle
  (memoize
    (fn [n]
      (apply +' (range (inc n))))))


(defn -main [& _]
(println (last (first (filter #(> (count %) 500) (map #(factors %) (map #(triangle %) (range))))))))

; (filter #(> (count %) 5) (map #(factors %) (map #(triangle %) (range 1 (inc 7)))))



;; (defn triangle [n]
;;   (apply +' (range (inc n))))

;; (defn triangle-factors' [n]
;;   (factors (triangle n)))

;; (def triangle-factors
;;   (memoize 
;;     (fn [n]
;;       (triangle-factors' n))))



;; (defn -main [& _]
;;   (def a (apply max (map #(count (triangle-factors %)) (range 10000))))
;;   (print a))


; working
; (filter #(> (count %) 5) (map #(factors %) (map #(triangle %) (range 1 (inc 7)))))