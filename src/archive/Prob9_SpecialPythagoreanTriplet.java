package archive;

import main.Problem;

/**

 A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 a^2 + b^2 = c^2

 For example, 32 + 42 = 9 + 16 = 25 = 52.

 There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 Find the product abc.

 */
public class Prob9_SpecialPythagoreanTriplet extends Problem {

    public final static int SUM = 1000;

    @Override
    protected int run() {
        int a, b, c;
        int halfSumSq = SUM * SUM / 2;
        for (a = SUM / 2 - 1; a >= a - SUM && ((a*SUM - halfSumSq) % (a - SUM) != 0); a--) { }
        logTime("Found triple");
        b = (a*SUM - halfSumSq)/(a - SUM);
        c = SUM - a - b;
        log(a);
        log(b);
        log(c);
        return a*b*c;
    }

    // a^2 + b^2 = c^2      and     a + b + c = SUM
    // Can I find b in terms of a and sum?
    //                              c = SUM - a - b
    // a^2 + b^2 = (SUM - a - b)^2
    // a^2 + b^2 = (SUM - a - b)(SUM - a - b)
    // a^2 + b^2 = SUM(SUM - a - b) - a(SUM - a - b) - b(SUM - a - b)
    // a^2 + b^2 = SUM(SUM - a - b) + a(-SUM + a + b) + b(-SUM + a + b)
    // a^2 + b^2 = (SUM^2 - SUM*a - SUM*b) + (-a*SUM + a^2 + a*b) + (-b*SUM + b*a + b^2)
    // a^2 + b^2 = SUM^2 + -2*a*SUM + a^2 + 2*a*b + -2*b*SUM + b^2
    // 0 = SUM^2 + -2*a*SUM + 2*a*b + -2*b*SUM
    // -SUM^2 + 2*a*SUM = 2*a*b + -2*b*SUM
    // -SUM^2 + 2*a*SUM = (a - SUM)*2*b
    // -SUM^2/2 + a*SUM = (a - SUM)*b
    // a*SUM - SUM^2/2 = (a - SUM)*b
    // (a*SUM - SUM^2/2)/(a - SUM) = b
    //
    // Yes! Let's goooooooo!
    // Took a few corrections tho, from consulting wolfram-alpha

    // b = (a*SUM - halfSumSq)/(a - SUM);
    // to test if b is an integer,
    // (a*SUM - halfSumSq) % (a - SUM) == 0
    // and since c is an integer iff b is an integer,
    //     then if b is an integer, a,b,c are all integers
    //     and we have a pythagorean triple

}
