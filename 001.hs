-- Find the sum of all the multiples of 3 or 5 below 1000.

module Main where

main = putStrLn (show answer)
answer = sum [x | x <- [1..999], mod x 3 == 0 || mod x 5 == 0]
