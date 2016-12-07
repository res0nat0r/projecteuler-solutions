-- What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

module Main where

divisible n d
  | mod n d == 0 = True
  | otherwise = False

allDivisible n = all (== True) [divisible n d | d <- [1..20]]

main = print $ head $ filter allDivisible [1..]

-- 232792560
