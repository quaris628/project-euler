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

}
