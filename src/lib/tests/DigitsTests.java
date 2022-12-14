package lib.tests;

import lib.Digits;
import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;

import static lib.Digits.*;
import static org.junit.Assert.*;

public class DigitsTests {
    public DigitsTests() {}

    @Test
    public void getArr_int123_3and2and1() {
        int[] digits = Digits.getArr(123);

        assertEquals(3, digits.length);
        assertEquals(3, digits[0]);
        assertEquals(2, digits[1]);
        assertEquals(1, digits[2]);
    }

    @Test
    public void getArr_int2_2() {
        int[] digits = Digits.getArr(2);

        assertEquals(1, digits.length);
        assertEquals(2, digits[0]);
    }

    @Test
    public void getArr_int123base10_3and2and1() {
        int[] digits = getArr(123, 10);

        assertEquals(3, digits.length);
        assertEquals(3, digits[0]);
        assertEquals(2, digits[1]);
        assertEquals(1, digits[2]);
    }

    @Test
    public void getArr_int255base16_15and15() {
        int[] digits = getArr(255, 16);

        assertEquals(2, digits.length);
        assertEquals(15, digits[0]);
        assertEquals(15, digits[1]);
    }

    @Test
    public void getArr_bigInt2_2() {
        BigInteger num = new BigInteger("2");
        int[] digits = Digits.getArr(num);

        assertEquals(1, digits.length);
        assertEquals(2, digits[0]);
    }

    @Test
    public void getArr_bigInt123base10_3and2and1() {
        BigInteger num = new BigInteger("123");
        int[] digits = getArr(num, 10);

        assertEquals(3, digits.length);
        assertEquals(3, digits[0]);
        assertEquals(2, digits[1]);
        assertEquals(1, digits[2]);
    }

    @Test
    public void getArr_bigInt255base16_15and15() {
        BigInteger num = new BigInteger("255");
        int[] digits = getArr(num, 16);

        assertEquals(2, digits.length);
        assertEquals(15, digits[0]);
        assertEquals(15, digits[1]);
    }

    @Test
    public void getInto_int123LinkedList_3and2and1() {
        LinkedList<Integer> ll = new LinkedList<>();
        getInto(123, ll);

        assertEquals(3, ll.size());
        assertEquals(Integer.valueOf(3), ll.get(0));
        assertEquals(Integer.valueOf(2), ll.get(1));
        assertEquals(Integer.valueOf(1), ll.get(2));
    }

    @Test
    public void getInto_int123base10LinkedList_3and2and1() {
        LinkedList<Integer> ll = new LinkedList<>();
        getInto(123, ll, 10);

        assertEquals(3, ll.size());
        assertEquals(Integer.valueOf(3), ll.get(0));
        assertEquals(Integer.valueOf(2), ll.get(1));
        assertEquals(Integer.valueOf(1), ll.get(2));
    }

    @Test
    public void getInto_int255base16ArrayList_15and15() {
        ArrayList<Integer> arrList = new ArrayList<>();
        getInto(255, arrList, 16);

        assertEquals(2, arrList.size());
        assertEquals(Integer.valueOf(15), arrList.get(0));
        assertEquals(Integer.valueOf(15), arrList.get(1));
    }

    @Test
    public void getInto_bigInt123LinkedList_3and2and1() {
        BigInteger num = new BigInteger("123");
        LinkedList<Integer> ll = new LinkedList<>();

        getInto(num, ll);

        assertEquals(3, ll.size());
        assertEquals(Integer.valueOf(3), ll.get(0));
        assertEquals(Integer.valueOf(2), ll.get(1));
        assertEquals(Integer.valueOf(1), ll.get(2));
    }

    @Test
    public void getInto_bigInt123base10LinkedList_3and2and1() {
        BigInteger num = new BigInteger("123");
        LinkedList<Integer> ll = new LinkedList<>();

        getInto(123, ll, 10);

        assertEquals(3, ll.size());
        assertEquals(Integer.valueOf(3), ll.get(0));
        assertEquals(Integer.valueOf(2), ll.get(1));
        assertEquals(Integer.valueOf(1), ll.get(2));
    }

    @Test
    public void getInto_bigInt255base16ArrayList_15and15() {
        BigInteger num = new BigInteger("255");
        ArrayList<Integer> arrList = new ArrayList<>();
        getInto(255, arrList, 16);

        assertEquals(2, arrList.size());
        assertEquals(Integer.valueOf(15), arrList.get(0));
        assertEquals(Integer.valueOf(15), arrList.get(1));
    }

    @Test
    public void buildNumFrom_arr3and2and1_123() {
        int[] digits = new int[] {3, 2, 1};
        assertEquals(123, Digits.buildNumFrom(digits));
    }

    @Test
    public void buildNumFrom_ll3and2and1_123() {
        LinkedList<Integer> digits = new LinkedList<>();
        digits.add(3);
        digits.add(2);
        digits.add(1);
        assertEquals(123, Digits.buildNumFrom(digits));
    }

    @Test
    public void buildNumFrom_arr3and2and1base10_123() {
        int[] digits = new int[] {3, 2, 1};
        assertEquals(123, buildNumFrom(digits, 10));
    }

    @Test
    public void buildNumFrom_arr7base10_7() {
        int[] digits = new int[] {7};
        assertEquals(7, buildNumFrom(digits, 10));
    }

    @Test
    public void buildNumFrom_arr15and15base16_255() {
        int[] digits = new int[] {15, 15};
        assertEquals(255, buildNumFrom(digits, 16));
    }

    @Test
    public void buildNumFrom_ll3and2and1base10_123() {
        LinkedList<Integer> digits = new LinkedList<>();
        digits.add(3);
        digits.add(2);
        digits.add(1);
        assertEquals(123, Digits.buildNumFrom(digits, 10));
    }

    @Test
    public void buildNumFrom_ll7base10_7() {
        LinkedList<Integer> digits = new LinkedList<>();
        digits.add(7);
        assertEquals(7, Digits.buildNumFrom(digits, 10));
    }

    @Test
    public void buildNumFrom_ll15and15base16_255() {
        LinkedList<Integer> digits = new LinkedList<>();
        digits.add(15);
        digits.add(15);
        assertEquals(255, Digits.buildNumFrom(digits, 16));
    }

    @Test
    public void getIntValue_char3_int3() {
        assertEquals(3, getIntValue('3'));
    }

    @Test
    public void getIntValue_charA_IllegalArgumentException() {
        try {
            getIntValue('A');
            fail();
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    public void getShortValue_char3_short3() {
        short three = 3;
        assertEquals(three, getShortValue('3'));
    }

    @Test
    public void getShortValue_charA_IllegalArgumentException() {
        try {
            getShortValue('A');
            fail();
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

}
