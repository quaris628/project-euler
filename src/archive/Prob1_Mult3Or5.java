package archive;


import main.Problem;

import static lib.Multiples.sumMultsLessThan;

/**
 * If we list all the natural numbers below 10 that are
 * multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Prob1_Mult3Or5 extends Problem {

    public final static int MAX = 1000;

    @Override
    public long run() {

        int sum = 0;
        for (int i = 3; i < MAX; i+=3) {
            sum += i;
        }
        log(sum);

        int sumMult3 = sumMultsLessThan(3, MAX);
        log("Sum mults 3", sumMult3);

        int sumMult5 = sumMultsLessThan(5, MAX);
        log("Sum mults 5", sumMult5);

        int sumMult15 = sumMultsLessThan(15, MAX);
        log("Sum mults 15", sumMult15);

        return sumMult3 + sumMult5 - sumMult15;
    }
}
