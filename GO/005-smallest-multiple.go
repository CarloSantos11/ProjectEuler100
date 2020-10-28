// Problem number 5 | Solution by Mrityunjaya Tripathi
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

package main

import (
	"fmt"
)

// greatest common divisor (GCD)
func GCD(a, b int) int {
	for b != 0 {
		t := b
		b = a % b
		a = t
	}
	return a
}

// Least Common Multiple (LCM)
func LCM(a, b int) int {
	return a * b / GCD(a, b)
}

// Main function
func main() {
	result := 1
	for j := 2; j <= 20; j++ {
		result = LCM(result, j)
	}
// Output printing.....
	fmt.Println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is : ")
	fmt.Println(result)
}
