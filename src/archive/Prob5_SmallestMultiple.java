package archive;

import lib.Multiples;
import lib.Naturals;
import main.Problem;

public class Prob5_SmallestMultiple extends Problem {
    @Override
    protected long run() {
        long lcm = Multiples.lcm(Naturals.generate(20));
        if (lcm > Integer.MAX_VALUE) {
            logTime();
            throw new ArithmeticException("Result " + lcm + " is greater than Integer.MAX_VALUE");
        }
        return (int)lcm;
    }
}
