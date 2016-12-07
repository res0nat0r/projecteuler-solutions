-- By considering the terms in the Fibonacci sequence whose values
-- do not exceed four million, find the sum of the even-valued terms.

module Main where
 
fibo :: Integer -> Integer
fibo n = fst $ foldl (\(a, b) _ -> (b, a + b)) (0, 1) [1 .. n]

main = print $ sum $ filter even $ takeWhile (< 4000000) $ map fibo [1..]

-- 4613732
