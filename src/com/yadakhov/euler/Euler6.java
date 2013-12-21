package com.yadakhov.euler;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 The sum of the squares of the first ten natural numbers is,

 12 + 22 + ... + 102 = 385
 The square of the sum of the first ten natural numbers is,

 (1 + 2 + ... + 10)2 = 552 = 3025
 Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

 Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/
public class Euler6 {
    public static void main(String[] args) {

        long sumSquared = 0;
        long sum = 0;

        for (int i = 1; i <= 100; i++) {
            sumSquared += Math.pow(i, 2);
            sum += i;
        }

        System.out.println("sumSquared " + sumSquared);
        System.out.println("sum " + sum);
        System.out.println("sum squared " + Math.pow(sum, 2));

        double diff = Math.pow(sum, 2) - sumSquared;

        System.out.println("The difference is " + new BigDecimal(diff).toPlainString());
    }
}
