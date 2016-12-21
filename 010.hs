-- The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
-- Find the sum of all the primes below two million.

module Main where

prime n = n == 2 || n > 2 && all ((> 0).rem n) (2:[3,5..floor.sqrt.fromIntegral $ n + 1])

main = do
  print $ sum $ filter prime [1..1999999]

-- 142913828922
