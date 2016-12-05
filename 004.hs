-- Find the largest palindrome made from the product of two 3-digit numbers.

module Main where


palindrome :: Integer -> Bool
palindrome p
  | show p == reverse (show p) = True
  | otherwise = False


main = putStrLn (show answer)
answer = maximum $ filter palindrome $ map (\[x,y] -> x * y) $ sequence [[100..999], [100..999]]

-- 906609
