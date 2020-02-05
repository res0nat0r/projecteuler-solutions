(ns p002.core-test
  (:require [clojure.test :refer :all]
            [p002.core :refer :all]))

(deftest problem-002
  (testing "Euler Problem 002"
    (is (= "4613732\n" (with-out-str(-main))))))

