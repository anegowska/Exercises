package codewars;
/*In the drawing below we have a part of the Pascal's triangle, lines are numbered from zero (top).

We want to calculate the sum of the squares of the binomial coefficients on a given line with a function called easyline
 (or easyLine or easy-line).

Can you write a program which calculate easyline(n) where n is the line number?

*/
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class EasyLine {

    public static BigInteger easyLine(int n) {

        List<Long> row = new ArrayList<>();
        row.add(1l);

        for (int i = 0; i < n; i ++) {
            row.add((row.get(i) * (n-i)) / (i+1));
        }

        BigInteger sum = new BigInteger("0");
        for (Long num : row) {
            sum = sum.add(BigInteger.valueOf(num * num));
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(easyLine(19));
    }
}
