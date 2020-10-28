# 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

# What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

def smallestMultiple
  lcm = 1 # least common multiple
  (2..20).each do |i|
    lcm *= i / greatestCommonDivisor(lcm, i)
  end

  lcm
end

def greatestCommonDivisor(a, b)
  while b > 0
    a %= b
    return b if a == 0
    b %= a
  end

  a
end

puts smallestMultiple
