(ns p003.core-test
  (:require [clojure.test :refer :all]
            [p003.core :refer :all]))

(deftest problem-003
  (testing "Euler Problem 003"
    (is (= "6857\n" (with-out-str(-main))))))
