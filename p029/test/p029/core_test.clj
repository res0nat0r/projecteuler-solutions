(ns p029.core-test
  (:require [clojure.test :refer :all]
            [p029.core :refer :all]))

(deftest p029-test
  (testing "Problem 029"
    (is (= "9183\n" (with-out-str(-main))))))
