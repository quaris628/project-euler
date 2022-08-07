package lib.util;

public class IO {

    public static String formatTime(long millisDuration) {
        StringBuilder s = new StringBuilder();
        s.append(millisDuration / 1000);
        s.append('.');
        s.append(millisDuration % 1000);
        s.append('s');
        return s.toString();
    }
}
