package edabit;

//Create a method that takes a single string as argument and returns an ordered array containing the indexes of
// all capital letters in the string.

import java.util.ArrayList;
import java.util.List;


public class CapitalLetters {

    public static int[] indexOfCaps(String s) {
        char[] charArray = s.toCharArray();
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < charArray.length; i++) {
            if (Character.isUpperCase(charArray[i])) {
                indexes.add(i);
            }
        }
        int[] result = new int[indexes.size()];
        for (int i = 0; i < indexes.size(); i++) {
            result[i] = indexes.get(i);
        }
        return result;
    }
}
