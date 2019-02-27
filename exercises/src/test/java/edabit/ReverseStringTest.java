package edabit;

import org.junit.Test;

import static edabit.ReverseString.reverse;
import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void shouldReturnReversedStringsWithFiveOrMoreLetters() {
        //given
        String s = "Reverse the order of every word greater than or equal to five characters.";

        String expectedString = "esreveR the redro of yreve word retaerg than or lauqe to five .sretcarahc";

        // when
        String result = reverse(s);

        // then
        assertEquals(expectedString, result);
    }
}