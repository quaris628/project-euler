package lib.tests;

import org.junit.Test;

import static lib.Naturals.*;
import static org.junit.Assert.*;

public class NaturalsTests {
    public NaturalsTests() {}

    @Test
    public void sumUpTo_10_55() {
        assertEquals(55, sumUpTo(10));
    }

    @Test
    public void sumUpTo_3_6() {
        assertEquals(6, sumUpTo(3));
    }

    @Test
    public void generate_5_12345() {
        int[] naturals = generate(5);

        assertEquals(5, naturals.length);
        assertEquals(1, naturals[0]);
        assertEquals(2, naturals[1]);
        assertEquals(3, naturals[2]);
        assertEquals(4, naturals[3]);
        assertEquals(5, naturals[4]);
    }

    @Test
    public void factorial_10_3628800() {
        assertEquals(3628800, factorial(10).intValue());
    }

    @Test
    public void factorial_1_1() {
        assertEquals(1, factorial(1).intValue());
    }

}
