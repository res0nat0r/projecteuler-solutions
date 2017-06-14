-- Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.

module Main where


main = do
  file <- readFile "013.txt"
  print $ take 10 $ show $ sum $ map read $ lines file
