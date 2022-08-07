package lib;

public class Naturals {

    public static int sumUpTo(int n) {
        return n * (n + 1) / 2;
    }

    public static int[] generate(int upTo) {
        int[] naturals = new int[upTo];
        for (int i = 1; i <= upTo; i++) {
            naturals[i - 1] = i;
        }
        return naturals;
    }

}
