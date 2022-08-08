package problem;

import lib.Digits;
import main.Problem;

/**
 A palindromic number reads the same both ways.
 The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

 Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Prob4_LargestPalindromeProduct extends Problem {
    @Override
    protected int run() {
        // Look at all palindromic numbers (starting with 997799 then decreasing)
        for (int palindromePart = 997; palindromePart >= 100; palindromePart--) {
            int fullPalindrome = 0; // TODO
        }
        // test if this number has a pair of 3 digit numbers that divide it

        return 0;
    }

    /**
     * palindromPart is first few digits, i.e. the more significant digits
     */
    private int buildPalindrome(int palindromePart) {
        Digits.getArr(palindromePart);
        return 0; // TODO
    }

    // My notes

    // 999 * 999 = 998 001
    //
    // Look at all combos of pairs of 3 digit numbers, check if each is palindrome
    // 999 * 999 * log10(999 * 999)
    // = 998 001 * log10(998 001)
    // ~= 998 001 * 6
    // ~= 6 000 000
    // (worst-case)
    //
    // Look at all palindromic numbers (starting with 997799 and decreasing from there)
    //     and see if they're the product of 2 3-digit numbers
    // 997 * [?]
    //
    // 6 000 000 / 1000 = 6000
    // So can I test if a 6 digit number is the product of 2 3-digit numbers
    //     in fewer computations than 6000?
    //
    // it's possible to test this in O(n), since the second number in the pair
    //     can be calculated in O(1) time
    // And so all pairs of 3-digit numbers can be iterated over by looping only 999 times
    //     (which should be easy to make there be less than about 6 computations each loop)
    // And I wouldn't need to check every pair of 3-digit numbers, either, since the
    //     range for each number in the pair has a lower bound where the other number has more than 3 digits

}
