package archive;

import lib.Naturals;
import main.Problem;

public class Prob4_SumSquareDifference extends Problem {

    public final static int MAX = 100;

    @Override
    protected int run() {
        int sum = Naturals.sumUpTo(MAX);
        int sumSquared = sum * sum;

        int sumOfSquares = 0;
        for (int i = 0; i <= MAX; i++) {
            sumOfSquares += i * i;
        }

        return sumSquared - sumOfSquares;
    }
}
