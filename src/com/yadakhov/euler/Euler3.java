package com.yadakhov.euler;

/**
    Largest prime factor
    Problem 3
    The prime factors of 13195 are 5, 7, 13 and 29.

    What is the largest prime factor of the number 600851475143 ?
*/
public class Euler3 {
    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(600851475143L));
    }

    public static int largestPrimeFactor(long number) {
        int i;
        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }
        return i;
    }
}
