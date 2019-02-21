package edabit;

/*Create a function that takes a string and returns a new string with all vowels removed.
"y" is not considered a vowel.*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WithoutVowels {

    //Solution #1 - array
    public static String removeVowels(String s) {
        char[] stringToChar = s.toCharArray();

        char[] newArray = new char[stringToChar.length];
        int vowels = 0;
        for (int i = 0, j=0; i < stringToChar.length-vowels; i++, j++) {
                if (stringToChar[j] != 'a'
                        && stringToChar[j] != 'A'
                        &&  stringToChar[j] != 'e'
                        &&  stringToChar[j] != 'E'
                        &&  stringToChar[j] != 'i'
                        &&  stringToChar[j] != 'I'
                        &&  stringToChar[j] != 'o'
                        &&  stringToChar[j] != 'O'
                        &&  stringToChar[j] != 'u'
                        &&  stringToChar[j] != 'U') {
                    newArray[i] = stringToChar[j];
                }else {
                    vowels++;
                    i--;
                }
        }
        char[] result = new char[newArray.length-vowels];
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] != 0) {
                result[i] = newArray[i];
            }
        }
        return new String(result);
    }

    //Solution #2 - ArrayList
   /* public static String removeVowels(String s) {

        List<Character> charList = new ArrayList<>();

        for (Character c : s.toCharArray()) {
            if (c != 'a'
                    && c != 'A'
                    && c != 'e'
                    && c != 'E'
                    && c != 'i'
                    && c != 'I'
                    && c != 'o'
                    && c != 'O'
                    && c != 'u'
                    && c != 'U') {
                charList.add(c);
            }
        }

        return charList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(""));
    }*/
}
