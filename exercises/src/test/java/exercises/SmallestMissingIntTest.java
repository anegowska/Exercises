package exercises;

import org.junit.Test;

import static exercises.SmallestMissingInt.smallestMissingInt;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SmallestMissingIntTest {

    @Test
    public void returnSmallestMissingInteger() {
        //given
        int[] array = {1, 2, 6, 4, 1, 3, 2};
        int expectedNum = 5;

        //when
        int result = smallestMissingInt(array);

        //then
        assertThat(expectedNum, is(result));
    }

    @Test
    public void returnSmallestMissingIntegerFromSequencedArray() {
        //given
        int[] array = {1,2,3};
        int expectedNum = 4;

        //when
        int result = smallestMissingInt(array);

        //then
        assertThat(expectedNum, is(result));
    }

    @Test
    public void returnSmallestMissingIntegerWhenArrayContainsNegativeNums() {
        //given
        int[] array = {-3,-1,-2};
        int expectedNum = 1;

        //when
        int result = smallestMissingInt(array);

        //then
        assertThat(expectedNum, is(result));
    }
}