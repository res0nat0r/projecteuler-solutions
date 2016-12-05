-- What is the largest prime factor of the number 600851475143 ?

module Main where

factor n d
  | mod n d == 0 = True
  | otherwise = False

factors n = [d | d <- [2..n-1], mod n d == 0]

prime n = null (factors n)

main = putStrLn (show answer)
answer = maximum $ takeWhile prime (factors 600851475143)

-- 6857
