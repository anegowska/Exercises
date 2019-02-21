package edabit;

import org.junit.Test;

import static edabit.WithoutVowels.removeVowels;
import static org.junit.Assert.*;

public class WithoutVowelsTest {

    @Test
    public void shouldReturnStringWithoutVowels() {
        //given
        String s = "I have never seen a thin person drinking Diet Coke.";

        String expectedString = " hv nvr sn  thn prsn drnkng Dt Ck.";

        // when
        String result = removeVowels(s);

        // then
        assertEquals(expectedString, result);
    }
}