package lib;

import static lib.ArrayUtilities.*;

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
}
