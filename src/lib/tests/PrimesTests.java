package lib.tests;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Set;

import static lib.Primes.*;
import static org.junit.Assert.*;

public class PrimesTests {
    public PrimesTests() {}

    @Test
    public void generateSet_10_2357() {
        Set<Integer> primes = generateSet(10);

        assertEquals(4, primes.size());
        assertTrue(primes.contains(2));
        assertTrue(primes.contains(3));
        assertTrue(primes.contains(5));
        assertTrue(primes.contains(7));
    }

    @Test
    public void generateIn_LinkedListUpTo10_2357() {
        LinkedList<Integer> primes = new LinkedList<Integer>();
        generateIn(primes, 10);

        assertEquals(4, primes.size());
        assertTrue(primes.contains(2));
        assertTrue(primes.contains(3));
        assertTrue(primes.contains(5));
        assertTrue(primes.contains(7));
    }

    @Test
    public void isPrime_2_true() {
        assertTrue(isPrime(2));
    }

    @Test
    public void isPrime_3_true() {
        assertTrue(isPrime(3));
    }

    @Test
    public void isPrime_4_false() {
        assertFalse(isPrime(4));
    }

    @Test
    public void isPrime_5_true() {
        assertTrue(isPrime(5));
    }

    @Test
    public void isPrime_6_false() {
        assertFalse(isPrime(6));
    }

    @Test
    public void isPrime_9_false() {
        assertFalse(isPrime(9));
    }

    @Test
    public void isPrime_17_true() {
        assertTrue(isPrime(17));
    }

    @Test
    public void isPrime_49_false() {
        assertFalse(isPrime(49));
    }
}
