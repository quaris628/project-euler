package lib.tests.util;

import org.junit.Test;

import static lib.util.Arrs.*;
import static org.junit.Assert.*;

public class ArrsTests {
    public ArrsTests() {}

    @Test
    public void sum_12345_15() {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        assertEquals(15, sum(arr));
    }

    @Test
    public void product_12345_120() {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        assertEquals(120, product(arr));
    }

    @Test
    public void product_1thru30_negative() {
        int[] arr = new int[] {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        assertTrue(product(arr) < 0);
    }

    @Test
    public void productCheckOverflow_12345_120() {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        assertEquals(120, productCheckOverflow(arr));
    }

    @Test
    public void productCheckOverflow_1thru30_ArithmeticException() {
        int[] arr = new int[] {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        try {
            productCheckOverflow(arr);
            fail();
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
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
