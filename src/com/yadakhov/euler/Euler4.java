package com.yadakhov.euler;

/**
    Largest palindrome product
    Problem 4
    A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

    Find the largest palindrome made from the product of two 3-digit numbers.
*/
public class Euler4 {
    public static void main(String[] args) {
        int a = 999;
        int b = 999;

        int maxPalindrome = 0;

        for (int i = a; i > 0; i--) {
            for (int j = b; j > 0; j--) {
                int product = i * j;
                if (isPalindrome(product)) {
                    if (product > maxPalindrome) {
                        maxPalindrome = product;
                    }
                }
            }
        }

        System.out.println("The max palindrome is " + maxPalindrome);
    }

    public static boolean isPalindrome(int number) {
        String num = "" + number;
        String reverse = new StringBuffer(num).reverse().toString();

        return num.equals(reverse);
    }
}
