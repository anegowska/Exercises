package edabit;

import org.junit.Test;

import static edabit.UniqueSort.sort;
import static org.junit.Assert.*;

public class UniqueSortTest {

    @Test
    public void shouldReturnSortedArray() {
        //given
        int[] array = {5,1,6,3,2};
        int[] expectedArray = {1,2,3,5,6};

        //when
        int[] result = sort(array);

        //then
        assertArrayEquals(expectedArray, result);
    }

    @Test
    public void shouldReturnSortedArrayWithoutDuplicate() {
        //given
        int[] array = {1, 1, 5, 8, 8, 2, 3, 4, 4, 4, 10};
        int[] expectedArray = {1, 2, 3, 4, 5, 8, 10};

        //when
        int[] result = sort(array);

        //then
        assertArrayEquals(expectedArray, result);
    }
}