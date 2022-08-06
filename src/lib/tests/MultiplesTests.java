package lib.tests;

import org.junit.Test;

import static lib.Multiples.*;
import static org.junit.Assert.*;

public class MultiplesTests {
    public MultiplesTests() {}

    @Test
    public void greatestMultipleLessThan_3and10_9() {
        assertEquals(9, greatestMultipleLessThan(3, 10));
    }

    @Test
    public void greatestMultipleLessThan_3and9_6() {
        assertEquals(6, greatestMultipleLessThan(3, 9));
    }

    @Test
    public void greatestMultipleLessThanOrEqual_3and10_9() {
        assertEquals(9, greatestMultipleLessThanOrEqual(3, 10));
    }

    @Test
    public void greatestMultipleLessThanOrEqual_3and9_9() {
        assertEquals(9, greatestMultipleLessThanOrEqual(3, 9));
    }

    @Test
    public void countMultiplesLessThan_3and9_2() {
        assertEquals(2, countMultiplesLessThan(3, 9));
    }

    @Test
    public void countMultiplesLessThanOrEqual_3and9_3() {
        assertEquals(3, countMultiplesLessThanOrEqual(3, 9));
    }

    @Test
    public void lcm_32_6() {
        assertEquals(6, lcm(2, 3));
    }

    @Test
    public void lcm_732_42() {
        assertEquals(42, lcm(7, 3, 2));
    }

    @Test
    public void lcm_93_9() {
        assertEquals(9, lcm(9, 3));
    }

    @Test
    public void lcm_1052_10() {
        assertEquals(10, lcm(10, 5, 2));
    }
}