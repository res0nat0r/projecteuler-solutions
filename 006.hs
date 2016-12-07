-- Find the difference between the sum of the squares of the 
-- first one hundred natural numbers and the square of the sum.

sumSquares = sum $ map (^2) [1..100]
squareSum = (^2) $ sum [1..100]

main = print $ squareSum - sumSquares

-- 25164150
