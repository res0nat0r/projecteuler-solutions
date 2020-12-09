(ns p011.core-test
  (:require [clojure.test :refer :all]
            [p011.core :refer :all]))

(deftest problem-011
  (testing "Euler Problem 011"
    (is (= "70600674\n" (with-out-str(-main))))))

