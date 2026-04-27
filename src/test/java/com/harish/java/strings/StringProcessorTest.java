package com.harish.java.strings;

import com.harish.java.strings.StringProcessor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {

    private final StringProcessor processor = new StringProcessor();

    // ---------------- countVowels ----------------
    @Test
    void testCountVowels() {
        assertEquals(0, processor.countVowels(""));
        assertEquals(0, processor.countVowels("rhythm"));
        assertEquals(2, processor.countVowels("hello")); // e, o
        assertEquals(5, processor.countVowels("AEIOU"));
        assertEquals(2, processor.countVowels("Java 21")); // a, a
    }

    // ---------------- reverse ----------------
    @Test
    void testReverse() {
        assertEquals("", processor.reverse(""));
        assertEquals("a", processor.reverse("a"));
        assertEquals("cba", processor.reverse("abc"));
        assertEquals("racecar", processor.reverse("racecar"));
    }

    // ---------------- isPalindrome ----------------
    @Test
    void testIsPalindrome() {
        assertTrue(processor.isPalindrome(""));
        assertTrue(processor.isPalindrome(" "));
        assertTrue(processor.isPalindrome("racecar"));
        assertTrue(processor.isPalindrome("Aa"));
        assertTrue(processor.isPalindrome("A man a plan a canal Panama"));

        assertFalse(processor.isPalindrome("hello"));
        assertFalse(processor.isPalindrome("ab"));
    }

    // ---------------- capitalizeWords ----------------
    @Test
    void testCapitalizeWords() {
        assertEquals("Hello World", processor.capitalizeWords("hello world"));
        assertEquals("Java", processor.capitalizeWords("java"));
        assertEquals("Unit Tests Are Useful", processor.capitalizeWords("unit tests are useful"));
    }

    // ---------------- countChar ----------------
    @Test
    void testCountChar() {
        assertEquals(0, processor.countChar("", 'a'));
        assertEquals(1, processor.countChar("a", 'a'));
        assertEquals(3, processor.countChar("banana", 'a'));
        assertEquals(0, processor.countChar("Banana", 'b')); // case-sensitive
        assertEquals(1, processor.countChar("Banana", 'B'));
    }
}
