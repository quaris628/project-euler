package lib;

import lib.util.MTree;

public class Pythagorean {

    public static void generateTriplets(MTree<Integer, Integer> triplets, int maxC) {
        // use M trees to store results!
        int sqrtMaxC = (int)Math.sqrt(maxC);
        for (int c = 2; c <= maxC; c++) {
            for (int b = c - 1; b >= sqrtMaxC; b--) {
                int a = Naturals.isPerfectSquare(c * c - b * b);
                if (a != -1) {
                    triplets.sub(c).sub(b).setValue(a);
                    // TODO see if I can utilize 3/4/5 etc. families for
                    //  greater efficiency
                }
            }
        }
    }

}
