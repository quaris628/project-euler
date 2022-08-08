package lib;

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

}
