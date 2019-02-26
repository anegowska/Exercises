package edabit;

//Create a function that takes an array of non-negative numbers and strings and return a new array without the strings.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterArray {

    public static String[] filterArray(String[] str) {
        List<Integer> list = new ArrayList<>();
        int num;
        for (String s : str) {
            try {
                num = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                num = -1;
            }
            if (num >= 0) {
                list.add(num);

            }
        }
        return list.stream()
                .distinct()
                .map(String::valueOf)
                .toArray(String[]::new);
    }
}
