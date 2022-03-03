/* Find the sum of all the multiples of 3 or 5 below 1000.

module Main where

main = print $ sum [x | x <- [1..999], mod x 3 == 0 || mod x 5 == 0]

-- 233168

*/

fn multiple_of_3_or_5(i: u8) -> u8 {
    if (i % 3 == 0) || (i % 5 == 0) {
        return i;
    } else {
        return 0;
    }
}

fn main() {
    for i in 1..10 {
        println!("{}", multiple_of_3_or_5(i))
    }
}
