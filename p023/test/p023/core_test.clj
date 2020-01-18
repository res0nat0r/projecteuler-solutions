(ns p023.core-test
  (:require [clojure.test :refer :all]
            [p023.core :refer :all]))

(deftest p023
  (testing "Problem 23 Solution"
    (is (= "4179871" (with-out-str(-main))))))