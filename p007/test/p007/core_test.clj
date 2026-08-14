(ns p007.core-test
  (:require [clojure.test :refer :all]
            [p007.core :refer :all]))

(deftest problem-007
  (testing "Euler Problem 007"
    (is (= "104743\n" (with-out-str(-main))))))
