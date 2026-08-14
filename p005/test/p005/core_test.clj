(ns p005.core-test
  (:require [clojure.test :refer :all]
            [p005.core :refer :all]))

(deftest problem-005
  (testing "Euler Problem 005"
    (is (= "232792560\n" (with-out-str(-main))))))
