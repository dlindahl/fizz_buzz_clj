(ns fizz-buzz.core-test
  (:require [clojure.test :refer :all]
            [fizz-buzz.core :refer :all]))

(deftest a-noop
  (testing "That unexciting numbers are unexciting"
    (is (= (makeitso 1) "1"))))

(deftest a-fizz
  (testing "That a fizzy number is fizzy"
    (is (= (makeitso 3) "fizz"))))

(deftest a-buzz
  (testing "That a buzzy number is buzzy"
    (is (= (makeitso 5) "buzz"))))

(deftest a-fzzbuzz
  (testing "That a fizzbuzzy number is fizzbuzzy"
    (is (= (makeitso 30) "fizzbuzz"))))