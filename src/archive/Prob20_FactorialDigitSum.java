package archive;

import lib.Digits;
import lib.Naturals;
import main.Problem;

import java.math.BigInteger;
import java.util.LinkedList;

public class Prob20_FactorialDigitSum extends Problem {
    @Override
    protected long run() {
        BigInteger factorial = Naturals.factorial(100);
        logTime("Gen factorial");
        log(factorial);
        LinkedList<Integer> digits = new LinkedList<>();
        Digits.getInto(factorial, digits);
        logTime("Parsed Digits");
        long sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
}
