package edabit;

//Write a method that takes two strings and returns (true or false) whether they're anagrams or not.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {

    public static boolean isAnagram(String s1, String s2) {
        String[] splitedS1 = s1.split("");
        String[] splitedS2 = s2.split("");

        List<String> firstList = Arrays.stream(splitedS1)
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());

        List<String> secondList = Arrays.stream(splitedS2)
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());

        return firstList.size() == secondList.size()
                && firstList.containsAll(secondList);
    }

    public static void main(String[] args) {
        String s1 = "Apple";
        String s2 = "Appeal";

        System.out.println(isAnagram(s1,s2));
    }
}
