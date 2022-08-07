package lib.tests.util;

import org.junit.Test;

import static lib.util.IO.formatTime;
import static org.junit.Assert.assertEquals;

public class IOTests {
    public IOTests() {}

    @Test
    public void formatTime_1001_1point1() {
        assertEquals("1.1s", formatTime(1001));
    }
}
