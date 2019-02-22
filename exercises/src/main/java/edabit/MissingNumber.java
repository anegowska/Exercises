package edabit;

//Create a method that takes an array of integers between 1 and 10 (excluding one number) and returns the missing number.
//The array of numbers will be unsorted

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MissingNumber {

    //Solution #1
    public static int missingNums(int[] nums) {

        int max;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    max = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = max;
                }
            }
        }
        int missingNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != (i + 1)) {
                missingNumber = nums[i] - 1;
                break;
            }
            if (i == nums.length - 1) {
                missingNumber = 10;
            }
        }
        return missingNumber;
    }

    //Solution #2
    /*public static int missingNums(int[] nums) {

        List<Integer> numsList = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());

        int missingNumber = 0;
        for (int i = 1; i < 11; i++) {
            if (!numsList.contains(i)) {
                missingNumber = i;
                break;
            }
        }
        return missingNumber;
    }*/
}
