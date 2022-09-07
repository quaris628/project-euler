package lib.tests;

import lib.util.MTree;
import org.junit.Test;

import static lib.Pythagorean.*;
import static org.junit.Assert.*;

public class PythagoreanTests {
    public PythagoreanTests() {}

    @Test
    public void generateTriples_6_543() {
        MTree<Integer, Integer> triplets = new MTree<Integer, Integer>();
        generateTriplets(triplets, 6);
        assertTrue(triplets.hasSub(5));
        assertTrue(triplets.sub(5).hasSub(4));
        assertEquals(3, (int)triplets.sub(5).sub(4).getValue());
    }

    @Test
    public void generateTriples_14_543and1086and13125() {
        MTree<Integer, Integer> triplets = new MTree<Integer, Integer>();
        generateTriplets(triplets, 14);
        // 5 4 3
        assertTrue(triplets.hasSub(5));
        assertTrue(triplets.sub(5).hasSub(4));
        assertEquals(3, (int)triplets.sub(5).sub(4).getValue());
        // 10 8 6
        assertTrue(triplets.hasSub(10));
        assertTrue(triplets.sub(10).hasSub(8));
        assertEquals(6, (int)triplets.sub(10).sub(8).getValue());
        // 13 12 5
        assertTrue(triplets.hasSub(13));
        assertTrue(triplets.sub(13).hasSub(12));
        assertEquals(5, (int)triplets.sub(13).sub(12).getValue());
    }

    @Test
    public void generateTriples_20000_largestUnder5sec() {
        long start = System.currentTimeMillis();
        MTree<Integer, Integer> triplets = new MTree<Integer, Integer>();
        generateTriplets(triplets, 20000);
        long end = System.currentTimeMillis();
        assertTrue(end - start < 5000);
    }

}
