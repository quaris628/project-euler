package archive;

import lib.Primes;
import main.Problem;

import java.util.HashSet;
import java.util.Set;

public class Prob10_SummationOfPrimes extends Problem {

    public final static int MAX = 2000000;

    @Override
    protected long run() {
        Set<Integer> primes = new HashSet<Integer>();
        Primes.generateIn(primes, MAX);

        long sum = 0;
        for (int prime : primes) {
            sum += prime;
        }

        return sum;
    }
}
