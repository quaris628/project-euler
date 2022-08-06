package lib.tests;

import org.junit.Test;

import java.util.LinkedList;

import static lib.Fibonacci.*;
import static org.junit.Assert.assertEquals;

public class FibonacciTests {
    public FibonacciTests() {}

    @Test
    public void generateArrLessThan_10_0and1and1and2and3and5and8() {
        int[] seq = generateArrLessThan(10);
        assertEquals(7, seq.length);
        assertEquals(0, seq[0]);
        assertEquals(1, seq[1]);
        assertEquals(1, seq[2]);
        assertEquals(2, seq[3]);
        assertEquals(3, seq[4]);
        assertEquals(5, seq[5]);
        assertEquals(8, seq[6]);
    }


    @Test
    public void generateLLLessThan_10_0and1and1and2and3and5and8() {
        LinkedList<Integer> seq = generateLLLessThan(10);
        assertEquals(7, seq.size());
        assertEquals(Integer.valueOf(0), seq.get(0));
        assertEquals(Integer.valueOf(1), seq.get(1));
        assertEquals(Integer.valueOf(1), seq.get(2));
        assertEquals(Integer.valueOf(2), seq.get(3));
        assertEquals(Integer.valueOf(3), seq.get(4));
        assertEquals(Integer.valueOf(5), seq.get(5));
        assertEquals(Integer.valueOf(8), seq.get(6));

    }

    @Test
    public void generateArr_7_0and1and1and2and3and5and8() {
        int[] seq = generateArr(7);
        assertEquals(7, seq.length);
        assertEquals(0, seq[0]);
        assertEquals(1, seq[1]);
        assertEquals(1, seq[2]);
        assertEquals(2, seq[3]);
        assertEquals(3, seq[4]);
        assertEquals(5, seq[5]);
        assertEquals(8, seq[6]);
    }

    @Test
    public void generateLL_7_0and1and1and2and3and5and8() {
        LinkedList<Integer> seq = generateLL(7);
        assertEquals(7, seq.size());
        assertEquals(Integer.valueOf(0), seq.get(0));
        assertEquals(Integer.valueOf(1), seq.get(1));
        assertEquals(Integer.valueOf(1), seq.get(2));
        assertEquals(Integer.valueOf(2), seq.get(3));
        assertEquals(Integer.valueOf(3), seq.get(4));
        assertEquals(Integer.valueOf(5), seq.get(5));
        assertEquals(Integer.valueOf(8), seq.get(6));
    }
}
