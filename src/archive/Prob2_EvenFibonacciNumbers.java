package archive;

import lib.Fibonacci;
import main.Problem;

import java.util.LinkedList;

public class Prob2_EvenFibonacciNumbers extends Problem {

    @Override
    protected long run() {
        LinkedList<Integer> fibSeq = Fibonacci.generateLLLessThan(4000001);
        log("Last fib number:", fibSeq.getLast());
        int sum = 0;
        for (int num : fibSeq) {
            // if even, 1 * num; if odd, 0 * num
            sum += ((num + 1) % 2) * num;
        }
        return sum;
    }
}
