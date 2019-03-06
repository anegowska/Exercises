package edabit;

//Create a function that takes an array of numbers and returns only the even values.
//Return all even numbers in the order they were given.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoOdds {

    public static int[] noOdds(int[] nums) {
        List<Integer> numbersList = new ArrayList<>();

        for (int num : nums) {
            if (num % 2 == 0) {
                numbersList.add(num);
            }
        }
        int[] result = new int[numbersList.size()];
        for (int i = 0; i < numbersList.size(); i++) {
            result[i] = numbersList.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {718, 991, 449, 644, 380, 440};
        System.out.println(Arrays.toString(noOdds(nums)));
    }
}
