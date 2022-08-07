package lib;

import static lib.util.Arrs.*;

public class Multiples {

    /**
     * O(1)
     */
    public static int greatestMultipleLessThan(int multOf, int max) {
        return max - 1 - ((max - 1) % multOf);
    }

    /**
     * O(1)
     */
    public static int greatestMultipleLessThanOrEqual(int multOf, int max) {
        return max - (max % multOf);
    }

    /**
     * O(1)
     */
    public static int countMultiplesLessThan(int multOf, int max) {
        return greatestMultipleLessThan(multOf, max) / multOf;
    }

    /**
     * O(1)
     */
    public static int countMultiplesLessThanOrEqual(int multOf, int max) {
        return greatestMultipleLessThanOrEqual(multOf, max) / multOf;
    }

    /**
     * O(num args + num args * args product / max arg)
     */
    public static int lcm(int... args) {
        int max = max(args);
        int product = product(args);

        int mult;
        for (mult = max; mult < product; mult+=max) {
            boolean allDivide = true;
            for (int item : args) {
                if (mult % item != 0) {
                    allDivide = false;
                    break;
                }
            }
            if (allDivide) { break; }
        }
        return mult;
    }

    /**
     * O(1)
     */
    public static int sumMultsUpTo(int n, int max) {
        int highestSummedMult = Multiples.greatestMultipleLessThan(n, max);
        int sumOfOneMultPair = n + highestSummedMult;
        int numMultPairs = (highestSummedMult / 2) / n;
        // ^ e.g. mults of 5 less than 20: 15 / 2 = 7, 7 / 5 = 1
        // ^ e.g. mults of 5 less than 21: 20 / 2 = 10, 10 / 5 = 2
        int sum = sumOfOneMultPair * numMultPairs;
        if (highestSummedMult / n > 2 * numMultPairs) {
            sum += sumOfOneMultPair / 2;
        }
        return sum;
    }
}
