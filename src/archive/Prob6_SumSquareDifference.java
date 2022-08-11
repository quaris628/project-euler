package archive;

import lib.Naturals;
import main.Problem;

public class Prob6_SumSquareDifference extends Problem {

    public final static int MAX = 100;

    @Override
    protected long run() {
        int sum = Naturals.sumUpTo(MAX);
        int sumSquared = sum * sum;

        int sumOfSquares = 0;
        for (int i = 0; i <= MAX; i++) {
            sumOfSquares += i * i;
        }

        return sumSquared - sumOfSquares;
    }
}
