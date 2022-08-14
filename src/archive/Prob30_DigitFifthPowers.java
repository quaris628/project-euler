package archive;

import lib.Digits;
import lib.Operations;
import main.Problem;

import java.util.Arrays;

/**
 Surprisingly there are only three numbers that can be written
 as the sum of fourth powers of their digits:

 1634 = 1^4 + 6^4 + 3^4 + 4^4
 8208 = 8^4 + 2^4 + 0^4 + 8^4
 9474 = 9^4 + 4^4 + 7^4 + 4^4

 As 1 = 1^4 is not a sum it is not included.

 The sum of these numbers is 1634 + 8208 + 9474 = 19316.

 Find the sum of all the numbers that can be written as the
 sum of fifth powers of their digits.
 */
public class Prob30_DigitFifthPowers extends Problem {

    public final static int POWER = 5;

    @Override
    protected long run() {
        int max = POWER * Operations.intPow(9, POWER);
        // 1 ^ POWER + 1 ^ POWER ... + 2 ^ POWER
        int min = POWER - 1 + Operations.intPow(2, POWER);
        log("min", min);
        log("max", max);

        int totalSum = 0;
        for (int i = min; i <= max; i++) {
            int[] digits = Digits.getArr(i);
            int digitsSum = 0;
            for (int digit : digits) {
                digitsSum += Operations.intPow(digit, POWER);
            }
            if (digitsSum == i) {
                log(digitsSum, "=", Arrays.toString(digits));
                totalSum += i;
            }
        }

        return totalSum;
    }
}
