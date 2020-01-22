(ns p036.core-test
  (:require [clojure.test :refer :all]
            [p036.core :refer :all]))

(deftest problem-036
  (testing "Euler Problem 036"
    (is (= "872187\n" (with-out-str(-main))))))
