(ns p008.core-test
  (:require [clojure.test :refer :all]
            [p008.core :refer :all]))

(deftest problem-008
  (testing "Euler Problem 008"
    (is (= "23514624000\n" (with-out-str(-main))))))
