package lib;

import java.util.Collection;
import java.util.LinkedList;

public class Digits {

    /**
     * O(log_10(num))
     * calls getArrOfDigits(num, 10)
     */
    public static int[] getArr(int num) {
        return getArr(num, 10);
    }

    /**
     * O(log_base(num))
     * Array is ordered by least to most significant place (digits[0] is ones place)
     */
    public static int[] getArr(int num, int base) {
        LinkedList<Integer> digitsLL = new LinkedList<>();
        getInto(num, digitsLL, base);
        int[] digitsArr = new int[digitsLL.size()];
        int i = 0;
        for (int digit : digitsLL) {
            digitsArr[i++] = digit;
        }
        return digitsArr;
    }

    /**
     * O(log_base(num) * [collection .add() time complexity])
     * calls getInto(num, digitsOutput, 10)
     */
    public static void getInto(int num, Collection<Integer> digitsOutput) {
        getInto(num, digitsOutput, 10);
    }

    /**
     * O(log_base(num) * [collection .add() time complexity])
     * Collection should (probably) be ordered to achieve intended functionality.
     * Digits will be inserted in order of least to most significant place
     */
    public static void getInto(int num, Collection<Integer> digitsOutput, int base) {
        while (num != 0) {
            digitsOutput.add(num % base);
            num /= base;
        }
    }

    /**
     * O(digits.length)
     * Input digits should be ordered from least to most significant (digits[0] is ones place)
     */
    public static int buildNumFrom(int[] digits) {
        return buildNumFrom(digits, 10);
    }

    /**
     * O(digits.length)
     * Input digits should be ordered from least to most significant (digits[0] is ones place)
     */
    public static int buildNumFrom(Iterable<Integer> digits) {
        return buildNumFrom(digits, 10);
    }

    /**
     * O(digits.length)
     * Input digits should be ordered from least to most significant (digits[0] is ones place)
     */
    public static int buildNumFrom(int[] digits, int base) {
        int number = 0;
        for (int i = 0; i < digits.length; i++) {
            number = number * base + digits[digits.length - 1 - i];
        }
        return number;
    }

    /**
     * O(digits.length)
     * Input digits should be ordered from least to most significant (digits[0] is ones place)
     */
    public static int buildNumFrom(Iterable<Integer> digits, int base) {
        int number = 0;
        int place = 1;
        for (int digit : digits) {
            number += place * digit;
            place *= base;
        }
        return number;
    }

    /**
     * O(1)
     * equivalent to (int) Digit.getShortValue(digit)
     */
    public static int getIntValue(char digit) {
        return getShortValue(digit);
    }

    /**
     * O(1)
     */
    public static short getShortValue(char digit) {
        return switch (digit) {
            case '0' -> 0;
            case '1' -> 1;
            case '2' -> 2;
            case '3' -> 3;
            case '4' -> 4;
            case '5' -> 5;
            case '6' -> 6;
            case '7' -> 7;
            case '8' -> 8;
            case '9' -> 9;
            default -> throw new IllegalArgumentException("'digit' must be a numeric digit");
        };
    }

}
