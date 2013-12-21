package com.yadakhov.euler;

/**
 10001st prime
 Problem 7
 By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

 What is the 10 001st prime number?
*/
public class Euler7 {

    public static void main(String[] args) {
        int primeCounter = 1;
        int number = 0;

        while (primeCounter <= 10001) {
            if (isPrime(number)) {
                System.out.println("The " + primeCounter + "th prime number is " + number);
                primeCounter++;
            }
            number++;
        }
    }

    /**
     * Return true is the number is prime
     * @param n
     * @return
     */
    public static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n % 2 == 0)
            // n is an even, so return true iff n is exactly 2
            return (n == 2);
        for (int i=3; i*i<=n; i+=2) {
            if (n % i == 0) {
                // i divides evenly into n, so n is not prime
                return false;
            }
        }
        return true;
    }
}
