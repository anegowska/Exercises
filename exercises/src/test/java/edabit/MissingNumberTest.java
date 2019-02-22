package edabit;

import org.junit.Test;

import static edabit.MissingNumber.missingNums;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MissingNumberTest {

    @Test
    public void shouldReturnMissingNumber() {
        //given
        int[] array = {10, 5, 1, 2, 4, 6, 8, 3, 9};
        int expectedNum = 7;

        //when
        int result = missingNums(array);

        //then
        assertThat(expectedNum, is(result));
    }
}