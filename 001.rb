#!/usr/bin/env ruby

# Find the sum of all the multiples of 3 or 5 below 1000.

total = 0

1000.times do |x|
  if x % 3 == 0 or x % 5 == 0
    total += x
  end
end

puts total
