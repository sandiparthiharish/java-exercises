package com.harish.java;

/**
 * EXERCISE 2 — Medium
 *
 * A grade calculator that maps numeric scores to letter grades.
 * Pay attention to access modifiers: the boundary constants below are private
 * and intentionally not accessible from outside this class.
 *
 * Grade boundaries:
 * <pre>
 *   90 – 100  →  "A"
 *   80 –  89  →  "B"
 *   70 –  79  →  "C"
 *   60 –  69  →  "D"
 *    0 –  59  →  "F"
 * </pre>
 */
public class GradeCalculator {

    // These constants are PRIVATE — only this class can see them.
    private static final int A_MIN = 90;
    private static final int B_MIN = 80;
    private static final int C_MIN = 70;
    private static final int D_MIN = 60;

    /**
     * Returns the letter grade for a numeric score.
     *
     * <p><b>Required construct:</b> an {@code if / else if / else} chain.
     * Use the private constants defined above (A_MIN, B_MIN, C_MIN, D_MIN).
     *
     * @param score a value between 0 and 100 (inclusive)
     * @return "A", "B", "C", "D", or "F"
     */
    public String getLetterGrade(int score) {
        throw new UnsupportedOperationException("TODO: implement using if/else if/else");
    }

    /**
     * Returns a text description for a letter grade.
     *
     * <p><b>Required construct:</b> a {@code switch} <em>expression</em> using arrow-case syntax
     * (Java 14+). Example skeleton:
     * <pre>
     *   return switch (letterGrade) {
     *       case "A" -> "...";
     *       ...
     *       default -> throw new IllegalArgumentException("Unknown grade: " + letterGrade);
     *   };
     * </pre>
     *
     * Mappings:
     * <ul>
     *   <li>"A" → "Excellent"</li>
     *   <li>"B" → "Good"</li>
     *   <li>"C" → "Average"</li>
     *   <li>"D" → "Below Average"</li>
     *   <li>"F" → "Failing"</li>
     * </ul>
     *
     * @param letterGrade "A", "B", "C", "D", or "F"
     * @return a human-readable description
     */
    public String getGradeDescription(String letterGrade) {
        throw new UnsupportedOperationException("TODO: implement using a switch expression");
    }

    /**
     * Calculates the average of all scores and returns the corresponding letter grade.
     *
     * <p><b>Required construct:</b> an enhanced {@code for-each} loop to sum the scores,
     * then call {@link #getLetterGrade(int)} with the rounded average (use {@code Math.round}).
     *
     * @param scores a non-empty array of scores (0–100)
     * @return the letter grade for the average score
     */
    public String calculateClassGrade(int[] scores) {
        throw new UnsupportedOperationException("TODO: implement using for-each + getLetterGrade");
    }

    /**
     * Returns {@code true} if every score in the array is 50 or above.
     * Returns {@code true} for an empty array (vacuously true).
     *
     * <p><b>Required construct:</b> a classic {@code for} loop with an early {@code return false}
     * as soon as a failing score is found — do not use a flag variable.
     *
     * @param scores an array of scores
     * @return {@code true} if all scores are >= 50
     */
    public boolean hasPassed(int[] scores) {
        throw new UnsupportedOperationException("TODO: implement using classic for + early return");
    }
}