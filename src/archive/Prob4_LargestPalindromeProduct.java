package archive;

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
        for (int firstPart = 999; firstPart >= 100; firstPart--) {
            int palindrome = buildEvenPalindrome(firstPart);
            // test if this number has a pair of 3 digit numbers that divide it

            // for each 3-digit number and its pair that makes their product be the palindrome,
            // starting with 999 and decreasing until the number is less than its pair
            for (int i = 999, pairNum = palindrome / 999; i >= pairNum; i--, pairNum = palindrome / i) {
                if (i * pairNum == palindrome) {
                    logTime("Finished");
                    log("Num 1", i);
                    log("Num 2", pairNum);
                    return palindrome;
                }
            }
        }

        return -1;
    }

    /**
     * O(number of digits) i.e. O(log10(firstPart))
     * firstPart is first few digits, i.e. the more significant digits
     */
    private int buildEvenPalindrome(int firstPart) {
        int[] firstDigits = Digits.getArr(firstPart);
        int[] allDigits = new int[firstDigits.length * 2];
        for (int i = 0; i < firstDigits.length; i++) {
            allDigits[firstDigits.length - 1 - i] = firstDigits[i];
            allDigits[firstDigits.length + i] = firstDigits[i];
        }
        return Digits.buildNumFrom(allDigits);
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
