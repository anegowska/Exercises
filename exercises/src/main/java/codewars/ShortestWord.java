package codewars;

//Simple, given a string of words, return the length of the shortest word(s).

import java.util.stream.Stream;

public class ShortestWord {

    //Solution#1
    public static int findShort(String s) {

        if (s == null) {
            throw new NullPointerException("Input string can't be null!");
        }
        if (s.isEmpty()) {
            throw new IllegalArgumentException("Input string can't be empty!");
        }
        String[] words = s.split(" ");

        return Stream.of(words)
                .mapToInt(w -> w.length())
                .min()
                .getAsInt();
    }

    //Solution #2
    /*public static int findShort(String s) {

        if (s == null) {
            throw new NullPointerException("Input string can't be null!");
        }
        if (s.isEmpty()) {
            throw new IllegalArgumentException("Input string can't be empty!");
        }
        String[] words = s.split(" ");

        int min = words[0].length();
        for (String word : words) {
            if (word.length() < min) {
                min = word.length();
            }
        }
        return min;
    }*/
}
