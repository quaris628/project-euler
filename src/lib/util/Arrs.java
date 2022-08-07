package lib.util;

public class Arrs {

    /**
     * O(array size)
     */
    public static int sum(int[] arr) {
        int sum = 0;
        for (int item : arr) {
            sum += item;
        }
        return sum;
    }


    /**
     * O(array size)
     */
    public static int product(int[] arr) {
        int product = 1;
        for (int item : arr) {
            product *= item;
        }
        return product;
    }

    /**
     * O(array size)
     * If there is a tie, returns whichever element comes first.
     */
    public static <T extends Object & Comparable> T max(T[] arr) {
        if (arr == null) { throw new NullPointerException(); }
        if (arr.length == 0) { throw new IllegalArgumentException("Array must not be empty"); }
        T max = arr[0];
        for (T o : arr) {
            if (o.compareTo(max) > 0) {
                max = o;
            }
        }
        return max;
    }

    /**
     * O(array size)
     * If there is a tie, returns whichever element comes first.
     */
    public static int max(int[] arr) {
        if (arr == null) { throw new NullPointerException(); }
        if (arr.length == 0) { throw new IllegalArgumentException("Array must not be empty"); }
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * O(array size)
     * If there is a tie, returns whichever element comes first.
     */
    public static <T extends Object & Comparable> int maxIndex(T[] arr) {
        if (arr == null) { throw new NullPointerException(); }
        if (arr.length == 0) { throw new IllegalArgumentException("Array must not be empty"); }
        T max = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    /**
     * O(array size)
     * If there is a tie, returns whichever element comes first.
     */
    public static int maxIndex(int[] arr) {
        if (arr == null) { throw new NullPointerException(); }
        if (arr.length == 0) { throw new IllegalArgumentException("Array must not be empty"); }
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    /**
     * O(array size)
     * If there is a tie, returns whichever element comes first.
     */
    public static <T extends Object & Comparable> T min(T[] arr) {
        if (arr == null) { throw new NullPointerException(); }
        if (arr.length == 0) { throw new IllegalArgumentException("Array must not be empty"); }
        T min = arr[0];
        for (T o : arr) {
            if (o.compareTo(min) < 0) {
                min = o;
            }
        }
        return min;
    }

    /**
     * O(array size)
     * If there is a tie, returns whichever element comes first.
     */
    public static int min(int[] arr) {
        if (arr == null) { throw new NullPointerException(); }
        if (arr.length == 0) { throw new IllegalArgumentException("Array must not be empty"); }
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    /**
     * O(array size)
     * If there is a tie, returns whichever element comes first.
     */
    public static <T extends Object & Comparable> int minIndex(T[] arr) {
        if (arr == null) { throw new NullPointerException(); }
        if (arr.length == 0) { throw new IllegalArgumentException("Array must not be empty"); }
        T min = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(min) < 0) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    /**
     * O(array size)
     * If there is a tie, returns whichever element comes first.
     */
    public static int minIndex(int[] arr) {
        if (arr == null) { throw new NullPointerException(); }
        if (arr.length == 0) { throw new IllegalArgumentException("Array must not be empty"); }
        int min = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
