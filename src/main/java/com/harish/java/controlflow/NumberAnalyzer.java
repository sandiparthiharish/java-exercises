package com.harish.java.controlflow;

/**
 * EXERCISE 1 — Medium
 *
 * Implement each method using the construct specified in its Javadoc.
 * Do not change method signatures.
 */
public class NumberAnalyzer {

    /**
     * Returns {@code true} if {@code number} is even, {@code false} otherwise.
     *
     * <p><b>Required construct:</b> a single ternary expression.
     * This is an <em>expression</em> — it produces a value directly.
     *
     * @param number any integer, including negative values and zero
     */
    public boolean isEven(int number) {
        throw new UnsupportedOperationException("TODO: implement isEven using a ternary expression");
    }

    /**
     * Returns the absolute value of {@code number} without using {@code Math.abs()}.
     *
     * <p><b>Required construct:</b> an {@code if/else} statement.
     * Notice how this is a <em>statement</em> — it controls flow but does not itself
     * produce a value, unlike the ternary in {@link #isEven(int)}.
     *
     * @param number any integer
     * @return the non-negative value of n
     */
    public int absoluteValue(int number) {
        throw new UnsupportedOperationException("TODO: implement absoluteValue using if/else");
    }

    /**
     * Returns the sum of all integers from 1 to {@code number} (inclusive).
     * Returns 0 if n is 0 or negative.
     *
     * <p><b>Required construct:</b> a classic {@code for} loop with a counter variable.
     *
     * @param number upper bound (inclusive)
     * @return 1 + 2 + ... + n, or 0 if n <= 0
     */
    public int sumUpTo(int number) {
        throw new UnsupportedOperationException("TODO: implement sumUpTo using a classic for loop");
    }

    /**
     * Returns {@code true} if {@code n} is a prime number.
     * A prime number is greater than 1 and divisible only by 1 and itself.
     *
     * <p><b>Required construct:</b> a {@code while} loop.
     * Hint: check divisors from 2 up to Math.sqrt(n).
     *
     * @param number the number to test
     * @return {@code true} if n is prime
     */
    public boolean isPrime(int number) {
        throw new UnsupportedOperationException("TODO: implement isPrime using a while loop");
    }

    /**
     * Returns the largest number in the given array.
     *
     * <p><b>Required construct:</b> an enhanced {@code for-each} loop.
     *
     * @param numbers a non-empty array of integers
     * @return the maximum value found
     * @throws IllegalArgumentException if the array is null or empty
     */
    public int findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        throw new UnsupportedOperationException("TODO: implement findMax using a for-each loop");
    }

    /**
     * Returns the count of even numbers in the given array.
     *
     * <p><b>Required construct:</b> an enhanced {@code for-each} loop combined with an {@code if} statement.
     *
     * @param numbers an array of integers (may be empty)
     * @return the number of even integers in the array
     */
    public int countEven(int[] numbers) {
        throw new UnsupportedOperationException("TODO: implement countEven using for-each + if");
    }
}