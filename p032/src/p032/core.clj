(ns p032.core
  (:gen-class))

(defn digits [n]
  (->> n str (map (comp read-string str))))

(defn pandigital? [n]
  (let [length-n      (count (str n))
        digits-of-n   (digits n)
        digits-1-to-n (set (range 1 (inc length-n)))]
    (every? digits-1-to-n digits-of-n)))

(def multiples
  (for [a (range 1 1000)
        b (range 1 1000)]
    (concat [a] [b] [(* a b)])))

(def multiples*
  (for [a (range 1 1000)
        b (range 1 1000)]
    (clojure.string/join (concat [a] [b] [(* a b)]))))

(def xxx
  (for [a (range 1 1000)
        b (range 1 1000)]

    [(concat [a] [b] [(* a b)])
     (read-string (clojure.string/join (concat [a] [b] [(* a b)])))]
    ))