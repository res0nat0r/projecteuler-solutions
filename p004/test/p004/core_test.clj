(ns p004.core-test
  (:require [clojure.test :refer :all]
            [p004.core :refer :all]))

(deftest problem-004
  (testing "Euler Problem 004"
    (is (= "906609\n" (with-out-str(-main))))))
