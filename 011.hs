{-
In the 20 ×20 grid below, four numbers along a diagonal line have been marked in red.
The product of these numbers is 26 ×63 ×78 ×14 =1788696.

What is the greatest product of four adjacent numbers in the same direction (up,
down, left, right, or diagonally) in the 20 ×20 grid?
-}

module Main where

import Data.List (transpose)

chunks :: [a] -> [[a]]
chunks [] = []
chunks x = take 4 x : chunks (drop 4 x)

flatten :: [[a]] -> [a]
flatten list = [elem | inner <- list, elem <- inner]

down :: [[a]] -> [[a]]
down = transpose

up :: [[a]] -> [[a]]
up m = reverse $ transpose m

diagonal :: [[a]] -> [[a]]
diagonal m =
  [ [m !! (r + i) !! (c + i) | i <- [0 .. min (len - r - 1) (height - c - 1)]]
  | r <- [0 .. len - 1],
    c <- [0 .. height - 1]
  ]
 where
  len = length m
  height = length $ head m

reverseDiagonal :: [[a]] -> [[a]]
reverseDiagonal m =
  [ [m !! (r + i) !! (c - i) | i <- [0 .. min (len - r - 1) c]]
  | r <- [0 .. len - 1],
    c <- [0 .. height - 1]
  ]
 where
  len = length m
  height = length $ head m

maxProduct :: [[Int]] -> Int
maxProduct m = maximum [u, d, diag, rdiag]
 where
  len = length m
  height = length $ head m
  u = maximum $ map product $ chunks $ flatten $ up m
  d = maximum $ map product $ chunks $ flatten $ down m
  diag = maximum $ map product $ chunks $ flatten $ diagonal m
  rdiag = maximum $ map product $ chunks $ flatten $ reverseDiagonal m

main :: IO ()
main = do
  f <- readFile "011.txt"
  let matrix = map (map read . words) (lines f) :: [[Int]]
  print $ maxProduct matrix
