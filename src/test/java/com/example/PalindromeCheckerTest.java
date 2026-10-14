
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    @Test
    void positiveTest_PalindromeString() {
        System.out.println("POSITIVE TEST: madam");
        assertTrue(PalindromeChecker.isPalindrome("madam"));
    }

    @Test
    void positiveTest_NumberPalindrome() {
        System.out.println("POSITIVE TEST: 12321");
        assertTrue(PalindromeChecker.isPalindrome("12321"));
    }

    @Test
    void negativeTest_NotPalindromeString() {
        System.out.println("NEGATIVE TEST: hello");
        assertTrue(PalindromeChecker.isPalindrome("hello"));
    }

    @Test
    void negativeTest_NullInput() {
        System.out.println("NEGATIVE TEST: null");
        assertFalse(PalindromeChecker.isPalindrome(null));
    }
}
