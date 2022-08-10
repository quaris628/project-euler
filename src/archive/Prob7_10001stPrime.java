package archive;

import lib.Primes;
import main.Problem;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**

 By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

 What is the 10 001st prime number?

 */
public class Prob7_10001stPrime extends Problem {

    @Override
    protected int run() {
        SortedSet<Integer> primes = new TreeSet<>(Collections.reverseOrder());
        int stopAt = Integer.MAX_VALUE / 2;
        // double the maximum generated value until the resulting set has at least 10001 primes
        for (int max = 60001; primes.size() < 10001 && max <= stopAt; max*=2) {
            log("Generating up to", max);
            Primes.generateIn(primes, max);
            logTime("Gen done");
        }
        logTime("Generated primes");
        // starting from larger primes, iterate until finding 10001st prime
        Iterator<Integer> iter = primes.iterator();
        for (int i = primes.size(); i > 10001; i--) {
            iter.next();
        }
        return iter.next();
    }
}
