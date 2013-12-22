package com.yadakhov.euler;

/**
 * Special Pythagorean triplet
 * Problem 9
 */
public class Euler9 {
    public static void main(String[] args) {

        // bruteforce
        for (int a = 1; a <= 1000; a++) {
            for (int b = 1; b <= 1000; b++) {
                for (int c = 1; c <= 1000; c++) {
                    if ((a + b + c) == 1000) {
                        int a2 = (int)Math.pow(a, 2);
                        int b2 = (int)Math.pow(b, 2);
                        int c2 = (int)Math.pow(c, 2);

                        if (a2 + b2 == c2) {

                            System.out.println("a: " + a + " b: " + b + " c: " + c);


                        }
                    }
                }
            }
        }
    }
}
