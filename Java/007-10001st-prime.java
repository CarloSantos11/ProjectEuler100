// Project Euler Problem 7
// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
// What is the 10 001st prime number?

public class The10001stPrime{
	
     // Checks if number is prime
    public static boolean isPrime(long num) {
	    
	// Check for unique case numbers outside the loop
        if (num < 2) return false;
        else if (num == 2) return true;
	    
	// Loop that iterates through the numbers and returns true for prime and false for not prime
        for (int i = 2; i < Math.sqrt(num) + 1; i++)
            if (num % i == 0)
                return false;
        return true;
    }
    
    // Returns nth prime number
    public static long primeCounter(long num) {
        int prime_pos = 0;
        long prime = 1;
        
	// Variable prime tracks the actual number at the nth position
        while (prime_pos < num) {
            prime++;
	    // If number is prime, increment through nth positions
            if (isPrime(prime)) {
                prime_pos++;
            }
        }
	// Returns prime number at the 10001th position   
        return prime;
    }
	
	// Main method
	public static void main(String[] args) {
	
	// Print statement calling the primeCounter method with this problem's given argument
        System.out.println(primeCounter(10001));
    }
}
