package com.yadakhov.euler;

/**
 Summation of primes
 Problem 10
 The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

 Find the sum of all the primes below two million.
 */
public class Euler10 {
    public static void main(String[] args) {
        long sum = 0;

        for (int i = 0; i <= 2000000; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println("The sum is " + sum);
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
