package edabit;

import org.junit.Test;

import static edabit.FilterArray.filterArray;
import static org.junit.Assert.*;

public class FilterArrayTest {

    @Test
    public void shouldReturnFilteredArrayWithoutStrings() {
        //given
        String[] array = {"w", "r", "cat", "43", "s", "$%^", "76", "d", "88"};
        String[] expectedArray = {"43", "76", "88"};

        //when
        String[] result = filterArray(array);

        //then
        assertEquals(expectedArray, result);
    }
}