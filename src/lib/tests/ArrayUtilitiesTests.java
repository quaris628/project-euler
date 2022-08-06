package lib.tests;

import org.junit.Test;

import static lib.ArrayUtilities.*;
import static org.junit.Assert.assertEquals;

public class ArrayUtilitiesTests {
    public ArrayUtilitiesTests() {}

    @Test
    public void sum_12345_15() {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        assertEquals(15, sum(arr));
    }

    @Test
    public void product_12345_15() {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        assertEquals(120, product(arr));
    }

    @Test
    public void max_Integer25143_5() {
        Integer[] arr = new Integer[] {2, 5, 1, 4, 3};
        assertEquals(Integer.valueOf(5), max(arr));
    }

    @Test
    public void maxIndex_Integer25143_1() {
        Integer[] arr = new Integer[] {2, 5, 1, 4, 3};
        assertEquals(1,  maxIndex(arr));
    }

    @Test
    public void max_int25143_5() {
        int[] arr = new int[] {2, 5, 1, 4, 3};
        assertEquals(5, max(arr));
    }

    @Test
    public void maxIndex_int25143_1() {
        int[] arr = new int[] {2, 5, 1, 4, 3};
        assertEquals(1, maxIndex(arr));
    }


    @Test
    public void min_Integer25143_1() {
        Integer[] arr = new Integer[] {2, 5, 1, 4, 3};
        assertEquals(Integer.valueOf(1), min(arr));
    }

    @Test
    public void minIndex_Integer25143_2() {
        Integer[] arr = new Integer[] {2, 5, 1, 4, 3};
        assertEquals(2,  minIndex(arr));
    }

    @Test
    public void min_int25143_1() {
        int[] arr = new int[] {2, 5, 1, 4, 3};
        assertEquals(1, min(arr));
    }

    @Test
    public void minIndex_int25143_2() {
        int[] arr = new int[] {2, 5, 1, 4, 3};
        assertEquals(2, minIndex(arr));
    }
}
