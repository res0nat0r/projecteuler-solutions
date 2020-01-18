(ns p025.core-test
  (:require [clojure.test :refer :all]
            [p025.core :refer :all]))

(deftest p025
  (testing "Valid solution"
           (is (= "4782" (with-out-str(-main))))))
