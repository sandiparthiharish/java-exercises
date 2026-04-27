package com.harish.java.strings;

/**
 * EXERCISE 3 — Medium
 * String processing utilities that practice all four iteration constructs
 * and switch on characters.
 */
public class StringProcessor {

    /**
     * Counts the number of vowels (a, e, i, o, u — case-insensitive) in the text.
     *
     * <p><b>Required construct:</b>
     * <ol>
     *   <li>A classic {@code for} loop iterating over each character index.</li>
     *   <li>A {@code switch} statement (not expression) inside the loop to match vowels.</li>
     * </ol>
     *
     * Hint: {@code text.charAt(i)} retrieves a character; use {@code Character.toLowerCase()}
     * before the switch.
     *
     * @param text any string (may be empty)
     * @return the count of vowel characters
     */
    public int countVowels(String text) {
        throw new UnsupportedOperationException("TODO: implement using classic for + switch statement");
    }

    /**
     * Returns the reverse of the given string.
     *
     * <p><b>Required construct:</b> a classic {@code for} loop starting from the last index
     * and counting down to 0. Build the result by concatenation or a {@code StringBuilder}.
     *
     * @param text any string (may be empty)
     * @return the characters of text in reverse order
     */
    public String reverse(String text) {
        throw new UnsupportedOperationException("TODO: implement using classic for (reverse index)");
    }

    /**
     * Returns {@code true} if the text reads the same forwards and backwards,
     * ignoring case and spaces.
     *
     * <p>Examples: "racecar" → true, "A man a plan a canal Panama" → true,
     * "hello" → false.
     *
     * <p><b>Required construct:</b> a {@code while} loop with two pointer variables
     * ({@code left} starting at 0, {@code right} starting at end).
     *
     * Hint: strip spaces first with {@code text.replace(" ", "").toLowerCase()}.
     *
     * @param text the string to test
     * @return {@code true} if it is a palindrome
     */
    public boolean isPalindrome(String text) {
        throw new UnsupportedOperationException("TODO: implement using a while loop with two pointers");
    }

    /**
     * Returns the sentence with the first letter of each word capitalised.
     *
     * <p>Example: "hello world" → "Hello World"
     *
     * <p><b>Required construct:</b> split the sentence by spaces, then use an enhanced
     * {@code for-each} loop over the resulting word array.
     *
     * Hint: for each word, combine {@code Character.toUpperCase(word.charAt(0))}
     * with {@code word.substring(1)}.
     *
     * @param sentence a string of space-separated words (non-null, non-empty)
     * @return the capitalised sentence
     */
    public String capitalizeWords(String sentence) {
        throw new UnsupportedOperationException("TODO: implement using for-each on split array");
    }

    /**
     * Counts how many times {@code target} appears in {@code text}.
     *
     * <p><b>Required construct:</b> a {@code do-while} loop.
     * The loop should increment an index each iteration and check the character at that index.
     * Handle the empty string case before the loop.
     *
     * @param text   the string to search in (may be empty)
     * @param target the character to count
     * @return the number of occurrences
     */
    public int countChar(String text, char target) {
        throw new UnsupportedOperationException("TODO: implement using a do-while loop");
    }
}