package com.harish.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberAnalyzerTest {

    private final NumberAnalyzer analyzer = new NumberAnalyzer();

    // ---------------- isEven ----------------
    @Test
    void testIsEven() {
        assertTrue(analyzer.isEven(2));
        assertTrue(analyzer.isEven(0));
        assertTrue(analyzer.isEven(-4));

        assertFalse(analyzer.isEven(3));
        assertFalse(analyzer.isEven(-7));
    }

    // ---------------- absoluteValue ----------------
    @Test
    void testAbsoluteValue() {
        assertEquals(5, analyzer.absoluteValue(5));
        assertEquals(5, analyzer.absoluteValue(-5));
        assertEquals(0, analyzer.absoluteValue(0));
    }

    // ---------------- sumUpTo ----------------
    @Test
    void testSumUpTo() {
        assertEquals(15, analyzer.sumUpTo(5));  // 1+2+3+4+5
        assertEquals(1, analyzer.sumUpTo(1));
        assertEquals(0, analyzer.sumUpTo(0));
        assertEquals(0, analyzer.sumUpTo(-10));
    }

    // ---------------- isPrime ----------------
    @Test
    void testIsPrime() {
        assertTrue(analyzer.isPrime(2));
        assertTrue(analyzer.isPrime(3));
        assertTrue(analyzer.isPrime(13));

        assertFalse(analyzer.isPrime(1));
        assertFalse(analyzer.isPrime(0));
        assertFalse(analyzer.isPrime(-5));
        assertFalse(analyzer.isPrime(4));
        assertFalse(analyzer.isPrime(9));
    }

    // ---------------- findMax ----------------
    @Test
    void testFindMax() {
        assertEquals(5, analyzer.findMax(new int[]{1, 2, 3, 4, 5}));
        assertEquals(-1, analyzer.findMax(new int[]{-5, -3, -1, -7}));
        assertEquals(10, analyzer.findMax(new int[]{10}));
    }

    @Test
    void testFindMaxThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> analyzer.findMax(null));
        assertThrows(IllegalArgumentException.class, () -> analyzer.findMax(new int[]{}));
    }

    // ---------------- countEven ----------------
    @Test
    void testCountEven() {
        assertEquals(3, analyzer.countEven(new int[]{1, 2, 3, 4, 6}));
        assertEquals(0, analyzer.countEven(new int[]{1, 3, 5, 7}));
        assertEquals(4, analyzer.countEven(new int[]{2, 4, 6, 8}));
        assertEquals(0, analyzer.countEven(new int[]{}));
    }
}
