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
    public static long product(int[] arr) {
        long product = 1;
        for (int item : arr) {
            product *= item;
        }
        return product;
    }

    /**
     * O(array size)
     */
    public static long productCheckOverflow(int[] arr) {
        long product = 1;
        for (int item : arr) {
            if ((item > 0 && product * item < product
                    || item < 0 && product * item > product)) {
                throw new ArithmeticException(
                        "Operation would cause overflow: "
                        + product + " *= " + item);
            }
            product *= item;
        }
        return product;
    }

    /**
     * O(array size * n)
     * Returns the indices of the N smallest elements in the array
     * For example, the 3 smallest elements of [5,2,3,1,4] are 1,2,3
     */
    public static <T extends Object & Comparable<T>> int[] getIndicesOfNSmallest(T[] arr, int n) {
        int[] cheapestUnicorns = new int[n];

        for(int i = 0; i < arr.length; i++) {
            // edge case for first item
            int j;
            if (i >= cheapestUnicorns.length
                    && arr[i].compareTo(arr[cheapestUnicorns[cheapestUnicorns.length - 1]]) >= 0) { // arr[i] >= arr[cheapestUnicorns[j]]
                // no need to edit any of the array
                continue;
            } else {
                j = Math.min(i, cheapestUnicorns.length - 1);
                cheapestUnicorns[j] = i;
            }

            for (j--;j >= 0; j--) {
                if (arr[i].compareTo(arr[cheapestUnicorns[j]]) >= 0) { // arr[i] >= arr[cheapestUnicorns[j]]
                    break;
                }
                // essentially swaps smallestIndices[j] with smallestIndices[j + 1]
                cheapestUnicorns[j + 1] = cheapestUnicorns[j];
                cheapestUnicorns[j] = i;
            }
        }
        return cheapestUnicorns;
    }

    /**
     * O(array size)
     * If there is a tie, returns whichever element comes first.
     */
    public static <T extends Object & Comparable<T>> T max(T[] arr) {
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
    public static <T extends Object & Comparable<T>> int maxIndex(T[] arr) {
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
    public static <T extends Object & Comparable<T>> T min(T[] arr) {
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
    public static <T extends Object & Comparable<T>> int minIndex(T[] arr) {
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
