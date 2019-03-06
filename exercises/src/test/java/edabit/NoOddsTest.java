package edabit;

import org.junit.Test;

import static edabit.NoOdds.noOdds;
import static org.junit.Assert.*;

public class NoOddsTest {

    @Test
    public void shouldReturnArrayWithoutOddNumbers() {
        //given
        int[] array = {718, 991, 449, 644, 380, 440};
        int[] expectedArray = {718, 644, 380, 440};

        //when
        int[] result = noOdds(array);

        //then
        assertArrayEquals(expectedArray, result);
    }

    @Test
    public void shouldReturnEmptyArray() {
        //given
        int[] array = {9, 49, 23};
        int[] expectedArray = {};

        //when
        int[] result = noOdds(array);

        //then
        assertArrayEquals(expectedArray, result);
    }
}