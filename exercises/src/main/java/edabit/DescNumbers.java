package edabit;

//Create a function that takes any non-negative number as an argument and return it with it's digits in descending order.

import java.util.Arrays;
import java.util.stream.Collectors;

public class DescNumbers {

    public static long sortDesc(long num) {

        if (num > 0) {

            String numAsString = String.valueOf(num);
            String[] digitsAsString = numAsString.split("");

            int[] digits = new int[digitsAsString.length];

            for (int i = 0; i < digitsAsString.length; i++) {
                int digit = Integer.valueOf(digitsAsString[i]);
                digits[i] = digit;
            }

            int max;
            for (int i = 0; i < digits.length - 1; i++) {
                for (int j = 0; j < digits.length - 1; j++) {
                    if (digits[j] < digits[j + 1]) {
                        max = digits[j + 1];
                        digits[j + 1] = digits[j];
                        digits[j] = max;
                    }
                }
            }
            String result = Arrays.stream(digits)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(""));

            return Long.valueOf(result);
        }
        return 0;
    }
}
