package lib;

import lib.util.MTree;

import java.util.Set;

public class Pythagorean {

    public static void generateTriplets(MTree<Integer, Integer> triplets, int maxC) {
        double sqrt2 = Math.sqrt(2);
        // use M trees to store results!

        // we know the first pythagorean triplet is with c = 5, so start there
        for (int c = 5; c <= maxC; c++) {
            for (int b = c - 1; sqrt2 * b >= c; b--) {
                //if (triplets.hasSub(c) && triplets.sub(c).hasSub(b)) { continue; }
                int a = Naturals.isPerfectSquare(c * c - b * b);
                if (a != -1) {
                    triplets.sub(c).sub(b).setValue(a);
                    // attempted to utilize 3/4/5 etc. families for greater efficiency,
                    // but it ended up being ~10 times slower for maxC = 20000.
                    /*
                    for (int m = 1; m * c <= maxC; m++) {
                        triplets.sub(m * c).sub(m * b).setValue(m * a);
                    }
                    */
                }
            }
        }
    }

}
