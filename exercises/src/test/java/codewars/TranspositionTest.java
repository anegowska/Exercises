package codewars;

import org.junit.Test;

import static codewars.Transposition.simpleTransposition;
import static org.junit.Assert.*;

public class TranspositionTest {

    @Test
    public void shouldReturnStringWihMovedLetters() {
        //given
        String s = "Simple text";

        String expectedString = "Sml etipetx";

        // when
        String result = simpleTransposition(s);

        // then
        assertEquals(expectedString, result);
    }
}