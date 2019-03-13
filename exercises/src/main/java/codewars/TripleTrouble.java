package codewars;
/*Write a function which takes numbers num1 and num2 and returns 1 if there is a straight triple of a number at any place
 in num1 and also a straight double of the same number in num2.
If this isn't the case, return 0.*/

import java.util.ArrayList;
import java.util.List;

public class TripleTrouble {

    public static int tripleDouble(long num1, long num2) {

        if (num1 != num2) {
            String[] splittedNum1 = String.valueOf(num1).split("");
            List<String> list = new ArrayList<>();

            for (int i = 2; i < splittedNum1.length; i++) {
                if (splittedNum1[i].equals(splittedNum1[i - 1]) && splittedNum1[i].equals(splittedNum1[i - 2])) {
                    list.add(splittedNum1[i]);
                    list.add(splittedNum1[i - 1]);
                    break;
                }
            }
            String s1 = String.join("", list);
            String s2 = String.valueOf(num2);
            if (s2.contains(s1)) {
                return 1;
            }
        }
        return 0;
    }
}
