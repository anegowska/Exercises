package edabit;

import org.junit.Test;

import static edabit.CapitalLetters.indexOfCaps;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CapitalLettersTest {

    @Test
    public void shouldReturnIndexesOfCapitalLetters() {
        // given
        String s = "@xCE#8S#i*$en";

        int[] expectedArray = {2, 3, 6};

        // when
        int[] result = indexOfCaps(s);

        // then
        assertThat(expectedArray, is(result));
    }

    @Test
    public void shouldReturnEmptyArray() {
        // given
        String s = "determine";

        int[] expectedArray = {};

        // when
        int[] result = indexOfCaps(s);

        // then
        assertThat(expectedArray, is(result));
    }
}