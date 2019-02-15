package edabit;

import java.util.Arrays;

public class UniqueSort {

    public static int[] sort(int[] nums) {

        int max;
        int duplicate = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    max = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = max;
                }
            }
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                duplicate++;
            }
        }

        int newLength = nums.length - duplicate;
        int[] result = new int[newLength];

        result[0] = nums[0];
        for(int i = 1,j = 1; i < newLength; i++, j++) {
            if (result[i - 1] == nums[j]) {
                i--;
            }else {
                result[i] = nums[j];
            }
        }
        return result;
    }
}
