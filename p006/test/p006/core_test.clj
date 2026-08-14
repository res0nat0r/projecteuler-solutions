(ns p006.core-test
  (:require [clojure.test :refer :all]
            [p006.core :refer :all]))

(deftest problem-006
  (testing "Euler Problem 006"
    (is (= "25164150\n" (with-out-str(-main))))))
