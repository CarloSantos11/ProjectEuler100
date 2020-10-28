// Project Euler Problem 7
// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
// What is the 10 001st prime number?

public class 007-10001st-prime{
	
     // Checks if number is prime
    public static boolean isPrime(long num) {
        if (num < 2) return false;
        else if (num == 2) return true;
        for (int i = 2; i < Math.sqrt(num) + 1; i++)
            if (num % i == 0)
                return false;
        return true;
    }
    
    // Returns nth prime number
    public static long primeCounter(long num) {
        int prime_pos = 0;
        long prime = 1;
        
        while (prime_pos < num) {
            prime++;
            if (isPrime(prime)) {
                prime_pos++;
            }
        }
        return prime;
    }
	
	// Main method
	 public static void main(String[] args) {
        System.out.println(primeCounter(10001));
    }
}