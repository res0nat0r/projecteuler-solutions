(ns p021.core-test
  (:require [clojure.test :refer :all]
            [p021.core :refer :all]))

(deftest p021-test
  (testing "Problem 021"
    (is (= "31626\n" (with-out-str(-main))))))
