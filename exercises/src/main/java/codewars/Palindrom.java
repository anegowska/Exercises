package codewars;

import java.util.ArrayList;
import java.util.List;

public class Palindrom {

    public static boolean isPalindrom (String str) {

        String[] splittedStr = str.split("");
        List<String> lettersList = new ArrayList<>();

        for (String letter : splittedStr) {
            letter = letter.toLowerCase();
            if (!letter.equals(" ")) {
                lettersList.add(letter);
            }
        }
        String strWithoutSpace = String.join("", lettersList);

        StringBuilder reverseStr = new StringBuilder();
        reverseStr.append(strWithoutSpace);
        reverseStr.reverse();

        return strWithoutSpace.contentEquals(reverseStr);
    }
}
