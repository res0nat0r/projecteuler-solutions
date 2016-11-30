-- Find the sum of all the multiples of 3 or 5 below 1000.

module Main where

multiple3or5 :: (Integral x) => x -> x
multiple3or5 x 
  | (x `mod` 3 == 0) || (x `mod` 5 == 0) = x
  | otherwise = 0

main = do
  putStrLn $ show $ sum $ map multiple3or5 [999,998..1]
