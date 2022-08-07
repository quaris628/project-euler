package lib.tests.util;

import org.junit.Test;

import static lib.util.IO.formatTime;
import static org.junit.Assert.assertEquals;

public class IOTests {
    public IOTests() {}

    @Test
    public void formatTime_1001_1point001s() {
        assertEquals("1.001s", formatTime(1001));
    }

    @Test
    public void formatTime_1010_1point010s() {
        assertEquals("1.010s", formatTime(1010));
    }

    @Test
    public void formatTime_1100_1point100s() {
        assertEquals("1.100s", formatTime(1100));
    }
}
