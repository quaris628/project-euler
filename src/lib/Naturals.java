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

    public static boolean isPerfectSquare(int num) {
        return isPerfectSquare((long)num);
    }

    public static boolean isPerfectSquare(long num) {
        if (num <= 0) { return false; }
        // stolen from:
        // https://stackoverflow.com/questions/21997371/perfect-square-algorithm-explanation-for-the-implementation
        // if num % 16 isn't a perfect square, num can't be either
        switch ((short)(num & 0xF)) {
            case 0:
            case 1:
            case 4:
            case 9:
                long sqrt = Math.round(Math.sqrt(num));
                return sqrt * sqrt == num;
            default:
                return false;
        }
    }
}
