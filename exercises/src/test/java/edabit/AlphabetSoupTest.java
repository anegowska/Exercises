package edabit;

import org.junit.Test;

import static edabit.AlphabetSoup.alphabetSoup;
import static org.junit.Assert.*;

public class AlphabetSoupTest {

    @Test
    public void shouldReturnStringInAlphabeticalOrder() {
        // given
        String s = "JavaScript";

        String expectedString = "aacijprstv";

        // when
        String result = alphabetSoup(s);

        // then
        assertEquals(expectedString, result);
    }
}