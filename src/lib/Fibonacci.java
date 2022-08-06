package lib;

import java.util.LinkedList;

public class Fibonacci {

    /**
     * O(number of elements)
     * Converts the output of generateLLLessThan to an array.
     */
    public static int[] generateArrLessThan(int max) {
        LinkedList<Integer> seqLL = generateLLLessThan(max);
        int[] seq = new int[seqLL.size()];
        int index = 0;
        for (int item : seqLL) {
            seq[index++] = item;
        }
        return seq;
    }

    /**
     * O(number of elements)
     */
    public static LinkedList<Integer> generateLLLessThan(int max) {
        if (max <= 0) { throw new IllegalArgumentException("No fibonacci numbers are less than 0"); }
        LinkedList<Integer> seq = new LinkedList<Integer>();
        seq.add(0);
        seq.add(1);
        seq.add(1);
        if (max == 1) { return seq; }
        int prev = 1;
        int current = 2;
        while (current <= max) {
            seq.add(current);
            int temp = current;
            current = prev + current;
            prev = temp;
        }
        return seq;
    }

    /**
     * O(count)
     */
    public static int[] generateArr(int count) {
        if (count <= 0) { throw new IllegalArgumentException("Must generate at least one number"); }
        int[] seq = new int[count];
        seq[0] = 0;
        if (count == 1) { return seq; }
        seq[1] = 1;
        if (count == 2) { return seq; }
        for (int i = 2; i < count; i++) {
            seq[i] = seq[i - 1] + seq[i - 2];
        }
        return seq;
    }

    /**
     * O(count)
     */
    public static LinkedList<Integer> generateLL(int count) {
        if (count <= 0) { throw new IllegalArgumentException("Must generate at least one number"); }
        LinkedList<Integer> seq = new LinkedList<Integer>();
        seq.add(0);
        if (count == 1) { return seq; }
        seq.add(1);
        if (count == 2) { return seq; }
        int prev = 1;
        int current = 1;
        for (int i = 2; i < count; i++) {
            seq.add(current);
            int temp = current;
            current = prev + current;
            prev = temp;
        }
        return seq;
    }
}
