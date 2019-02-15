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
    public void shouldReturnSortedArrayWithoutDuplicates() {
        //given
        int[] array = {1, 1, 5, 8, 8, 2, 3, 4, 4, 4, 10};
        int[] expectedArray = {1, 2, 3, 4, 5, 8, 10};

        //when
        int[] result = sort(array);

        //then
        assertArrayEquals(expectedArray, result);
    }

    @Test
    public void shouldReturnSortedArrayWithoutSeparatedDuplicates() {
        //given
        int[] array = {3, 6, 5, 4, 3, 27, 1, 100, 1};
        int[] expectedArray = {1, 3, 4, 5, 6, 27, 100};

        //when
        int[] result = sort(array);

        //then
        assertArrayEquals(expectedArray, result);
    }

}