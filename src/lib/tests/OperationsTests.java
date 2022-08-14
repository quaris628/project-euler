package lib.tests;

import org.junit.Test;

import static lib.Operations.*;
import static org.junit.Assert.assertEquals;

public class OperationsTests {
    public OperationsTests() {}

    @Test
    public void intPow_2toThe4_16() {
        assertEquals(16, intPow(2, 4));
    }

}
