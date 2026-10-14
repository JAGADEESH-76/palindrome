
package com.example;

public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        String reversed = new StringBuilder(str).reverse().toString();

        return str.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        String positive = "madam";
        String negative = "hello";

        System.out.println(positive + " -> "
                + isPalindrome(positive));

        System.out.println(negative + " -> "
                + isPalindrome(negative));
    }
}
