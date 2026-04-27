package com.harish.java.controlflow;

import com.harish.java.controlflow.GradeCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeCalculatorTest {

    private final GradeCalculator calculator = new GradeCalculator();

    // ---------------- getLetterGrade ----------------
    @Test
    void testGetLetterGradeBoundaries() {
        assertEquals("A", calculator.getLetterGrade(90));
        assertEquals("A", calculator.getLetterGrade(100));

        assertEquals("B", calculator.getLetterGrade(80));
        assertEquals("B", calculator.getLetterGrade(89));

        assertEquals("C", calculator.getLetterGrade(70));
        assertEquals("C", calculator.getLetterGrade(79));

        assertEquals("D", calculator.getLetterGrade(60));
        assertEquals("D", calculator.getLetterGrade(69));

        assertEquals("F", calculator.getLetterGrade(0));
        assertEquals("F", calculator.getLetterGrade(59));
    }

    @Test
    void testGetLetterGradeThrowsForOutOfRangeScores() {
        assertThrows(IllegalArgumentException.class, () -> calculator.getLetterGrade(-1));
        assertThrows(IllegalArgumentException.class, () -> calculator.getLetterGrade(101));
    }

    // ---------------- getGradeDescription ----------------
    @Test
    void testGetGradeDescriptionMappings() {
        assertEquals("Excellent", calculator.getGradeDescription("A"));
        assertEquals("Good", calculator.getGradeDescription("B"));
        assertEquals("Average", calculator.getGradeDescription("C"));
        assertEquals("Below Average", calculator.getGradeDescription("D"));
        assertEquals("Failing", calculator.getGradeDescription("F"));
    }

    @Test
    void testGetGradeDescriptionThrowsForUnknownLetter() {
        assertThrows(IllegalArgumentException.class, () -> calculator.getGradeDescription("E"));
        assertThrows(IllegalArgumentException.class, () -> calculator.getGradeDescription("Z"));
        assertThrows(IllegalArgumentException.class, () -> calculator.getGradeDescription(""));
    }

    // ---------------- calculateClassGrade ----------------
    @Test
    void testCalculateClassGradeUsesRoundedAverage() {
        // 89.5 -> 90 -> A (Math.round)
        assertEquals("A", calculator.calculateClassGrade(new int[]{89, 90}));

        // 59.5 -> 60 -> D (Math.round)
        assertEquals("D", calculator.calculateClassGrade(new int[]{59, 60}));
    }

    @Test
    void testCalculateClassGradeTypicalCases() {
        assertEquals("A", calculator.calculateClassGrade(new int[]{100, 90})); // avg 95
        assertEquals("B", calculator.calculateClassGrade(new int[]{80, 80, 80})); // avg 80
        assertEquals("F", calculator.calculateClassGrade(new int[]{0, 10, 20})); // avg 10
    }

    @Test
    void testCalculateClassGradeThrowsForNullOrEmpty() {
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateClassGrade(null));
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateClassGrade(new int[]{}));
    }

    // ---------------- hasPassed ----------------
    @Test
    void testHasPassed() {
        assertTrue(calculator.hasPassed(new int[]{})); // vacuously true
        assertTrue(calculator.hasPassed(new int[]{50}));
        assertTrue(calculator.hasPassed(new int[]{50, 75, 100}));

        assertFalse(calculator.hasPassed(new int[]{49}));
        assertFalse(calculator.hasPassed(new int[]{50, 49, 100}));
    }
}
