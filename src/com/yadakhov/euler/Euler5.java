package com.yadakhov.euler;

/**
    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/
public class Euler5 {
    public static void main(String[] args) {
        int number = 1;
        while (!isDivisible(number)) {
            number++;
        }
        System.out.println("The smallest number is " + number);
    }

    public static boolean isDivisible(int number) {
        for (int i = 1; i <= 20; i++) {
            if (number % i != 0) {
                return false;
            }
        }
        return true;
    }
}
