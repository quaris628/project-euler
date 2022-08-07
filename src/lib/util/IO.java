package lib.util;

public class IO {

    public static String formatTime(long millisDuration) {
        StringBuilder s = new StringBuilder();
        s.append(millisDuration / 1000);
        s.append('.');
        int millis = (int) (millisDuration % 1000);
        if (millis < 100) {
            s.append('0');
            if (millis < 10) {
                s.append('0');
            }
        }
        s.append(millis);
        s.append('s');
        return s.toString();
    }
}
