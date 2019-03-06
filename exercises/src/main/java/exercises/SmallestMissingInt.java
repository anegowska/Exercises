package exercises;

//Create a method that returns the smallest positive integer (greater than 0) that does not occur in input array.

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SmallestMissingInt {

    public static int smallestMissingInt(int[] array) {
        List<Integer> numsList = IntStream.of(array)
                .boxed()
                .collect(Collectors.toList());

        int missingNumber = 0;
        for (int i = 1; i <= numsList.size() + 1; i++) {
            if (!numsList.contains(i)) {
                missingNumber = i;
                break;
            }
        }
        return missingNumber;
    }
}
