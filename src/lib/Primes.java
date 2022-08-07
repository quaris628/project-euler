package lib;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static lib.Multiples.removeMultiplesOf;

public class Primes {

    /**
     * O(upTo / 6)
     * upTo bound is inclusive
     */
    public static Set<Integer> generateSet(int upTo) {
        Set<Integer> set = new HashSet<Integer>();
        generateIn(set, upTo);
        return set;
    }

    /**
     * O(upTo * [collection's .remove() time complexity] / 6)
     * upTo bound is inclusive
     */
    public static void generateIn(Collection<Integer> primes, int upTo) {
        // populate collection with possible primes
        // this set will eventually have all non-primes filtered out
        primes.add(2);
        primes.add(3);
        int i;
        for (i = 1; 6 * i + 1 <= upTo; i++) {
            primes.add(6 * i - 1);
            primes.add(6 * i + 1);
        }
        if (6 * i - 1 <= upTo) {
            primes.add(6 * i - 1);
        }
        // for each possible prime less than sqrt(upTo),
        // filter out all its multiples from the set of primes
        int sqrtUpTo = (int)Math.sqrt(upTo);
        for (i = 1; 6 * i + 1 <= sqrtUpTo; i++) {
            int p = 6 * i - 1;
            if (primes.contains(p)) {
                removeMultiplesOf(p, primes, upTo);
            }
            p = 6 * i + 1;
            if (primes.contains(p)) {
                removeMultiplesOf(p, primes, upTo);
            }
        }
        if (6 * i - 1 <= upTo) {
            int p = 6 * i - 1;
            if (primes.contains(p)) {
                removeMultiplesOf(p, primes, upTo);
            }
        }
    }

    /**
     * O(sqrt(num))
     */
    public static boolean isPrime(int num) {
        if (num % 2 == 0 || num % 3 == 0) { return num == 2 || num == 3; }
        // check if numbers that aren't multiples of 2 or 3 divide num
        int sqrtNum = (int)Math.sqrt(num);
        int i;
        boolean foundDivisor = false;
        for (i = 1; !foundDivisor && 6 * i + 1 <= sqrtNum; i++) {
            foundDivisor = num % (6 * i - 1) == 0 || num % (6 * i + 1) == 0;
        }
        if (!foundDivisor && 6 * i - 1 <= sqrtNum) {
            foundDivisor = num % (6 * i - 1) == 0;
        }
        return !foundDivisor;
    }
}
