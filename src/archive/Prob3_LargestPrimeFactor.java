package archive;

import lib.Primes;
import main.Problem;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

/**

 The prime factors of 13195 are 5, 7, 13 and 29.

 What is the largest prime factor of the number 600851475143 ?

 */
public class Prob3_LargestPrimeFactor extends Problem {

    @Override
    protected long run() {
        long number = 600851475143L;
        int numSqrt = (int)Math.sqrt(number);

        // we want to transverse the primes in descending order
        // so use a sorted tree set with O(log(n)) add/remove/contains, sorting in reverse
        SortedSet<Integer> primes = new TreeSet<Integer>(Collections.reverseOrder());
        Primes.generateIn(primes, numSqrt);

        logTime("Prime gen");

        for (int prime : primes) {
            if (number % prime == 0) {
                return prime;
            }
        }

        return -1;
    }
}
