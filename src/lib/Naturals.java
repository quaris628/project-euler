package lib;

import java.math.BigInteger;

public class Naturals {

    /**
     * O(1)
     */
    public static int sumUpTo(int n) {
        return n * (n + 1) / 2;
    }

    /**
     * O(upTo)
     */
    public static int[] generate(int upTo) {
        int[] naturals = new int[upTo];
        for (int i = 1; i <= upTo; i++) {
            naturals[i - 1] = i;
        }
        return naturals;
    }

    public static BigInteger factorial(int num) {
        BigInteger factorial = new BigInteger("1");
        BigInteger bigIntOne = new BigInteger("1");
        for (BigInteger i = new BigInteger(String.valueOf(num)); !i.equals(bigIntOne); i = i.subtract(bigIntOne)) {
            factorial = factorial.multiply(i);
        }
        return factorial;
    }

}
