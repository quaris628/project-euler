package lib;

public class Operations {

    /**
     * O(exp)
     */
    public static int intPow(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

}
