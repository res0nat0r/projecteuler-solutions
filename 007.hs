-- What is the 10,001st prime number?

module Main where

factor n d
  | mod n d == 0 = True
  | otherwise = False

factors n = [d | d <- [2..n-1], mod n d == 0]

prime n = null (factors n)

main = print $ filter prime [1..] !! 10001

-- 104743
