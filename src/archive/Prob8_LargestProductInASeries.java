package archive;

import lib.Digits;
import main.Problem;

import java.util.LinkedList;

public class Prob8_LargestProductInASeries extends Problem {

    public final static int SUBSEQ_LENGTH = 13;
    public final static String SEQ = "73167176531330624919225119674426574742355349194934" +
            "96983520312774506326239578318016984801869478851843" +
            "85861560789112949495459501737958331952853208805511" +
            "12540698747158523863050715693290963295227443043557" +
            "66896648950445244523161731856403098711121722383113" +
            "62229893423380308135336276614282806444486645238749" +
            "30358907296290491560440772390713810515859307960866" +
            "70172427121883998797908792274921901699720888093776" +
            "65727333001053367881220235421809751254540594752243" +
            "52584907711670556013604839586446706324415722155397" +
            "53697817977846174064955149290862569321978468622482" +
            "83972241375657056057490261407972968652414535100474" +
            "82166370484403199890008895243450658541227588666881" +
            "16427171479924442928230863465674813919123162824586" +
            "17866458359124566529476545682848912883142607690042" +
            "24219022671055626321111109370544217506941658960408" +
            "07198403850962455444362981230987879927244284909188" +
            "84580156166097919133875499200524063689912560717606" +
            "05886116467109405077541002256983155200055935729725" +
            "71636269561882670428252483600823257530420752963450";

    @Override
    protected int run() {
        String[] zeroSplitSeq = SEQ.split("0");
        LinkedList<String> nonzeroSubSeqs = new LinkedList<>();
        for (String subSeq : zeroSplitSeq) {
            if (subSeq.length() >= SUBSEQ_LENGTH) {
                nonzeroSubSeqs.add(subSeq);
            }
        }
        log("Num nonzeroSeqs", nonzeroSubSeqs.size());
        long maxProduct = 0L;
        for (String nonzeroSubSeq : nonzeroSubSeqs) {
            log(nonzeroSubSeq);
            // parse string into digits
            short[] digits = new short[nonzeroSubSeq.length()];
            for (int i = 0; i < nonzeroSubSeq.length(); i++) {
                digits[i] = Digits.getShortValue(nonzeroSubSeq.charAt(i));
            }

            long[] products = new long[nonzeroSubSeq.length() - SUBSEQ_LENGTH + 1];
            // compute the first product
            products[0] = 1;
            for (int i = 0; i < SUBSEQ_LENGTH; i++) {
                products[0] *= digits[i];
            }
            log(0, products[0]);
            if (products[0] > maxProduct) {
                maxProduct = products[0];
            }

            // compute the next product by using the result of the previous, etc.
            for (int i = 1; i <= nonzeroSubSeq.length() - SUBSEQ_LENGTH; i++) {
                products[i] = digits[i - 1 + SUBSEQ_LENGTH] * products[i - 1] / digits[i - 1];
                log(i, products[i]);
                if (products[i] > maxProduct) {
                    maxProduct = products[i];
                }
            }
        }

        if (maxProduct >= Integer.MAX_VALUE) {
            logTime("Problem complete");
            log("Result", maxProduct);
            throw new ArithmeticException("Result overflows signed integer values");
        }
        return (int) maxProduct;
    }
}
