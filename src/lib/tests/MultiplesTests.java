package lib.tests;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

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
    public void lcm_3and2_6() {
        assertEquals(6, lcm(2, 3));
    }

    @Test
    public void lcm_7and3and2_42() {
        assertEquals(42, lcm(7, 3, 2));
    }

    @Test
    public void lcm_9and3_9() {
        assertEquals(9, lcm(9, 3));
    }

    @Test
    public void lcm_10and5and2_10() {
        assertEquals(10, lcm(10, 5, 2));
    }


    @Test
    public void lcm_1thru10_2520() {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(2520, lcm(nums));
    }

    @Test
    public void sumMultsLessThan_mult3max10_18() {
        assertEquals(18, sumMultsLessThan(3, 10));
    }

    @Test
    public void sumMultsLessThan_mult5max20_30() {
        assertEquals(30, sumMultsLessThan(5, 20));
    }

    @Test
    public void sumMultsLessThan_mult5max21_50() {
        assertEquals(50, sumMultsLessThan(5, 21));
    }

    @Test
    public void removeMultiplesOf_2from123456upTo6_1235() {
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);

        removeMultiplesOf(2, set, 6);

        assertEquals(4, set.size());
        assertTrue(set.contains(1));
        assertTrue(set.contains(2));
        assertTrue(set.contains(3));
        assertTrue(set.contains(5));
    }
}
