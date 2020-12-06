(ns p001.core-test
  (:require [clojure.test :refer :all]
            [p001.core :refer :all]))

(deftest problem-001
  (testing "Euler Problem 001"
    (is (= "233168\n" (with-out-str(-main))))))

