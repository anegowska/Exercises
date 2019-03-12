package codewars;

import org.junit.Test;

import static codewars.ShortestWord.findShort;
import static org.junit.Assert.*;

public class ShortestWordTest {

    @Test
    public void shouldReturnLengthOfShortestWord() {
        //given
        String s = "Bitcoin take over the world maybe who knows perhaps";

        int shortest = 3;

        // when
        int result = findShort(s);

        // then
        assertEquals(shortest, result);
    }

    @Test(expected = NullPointerException.class)
    public void shouldNotAcceptNull() {

        String s = null;
        findShort(s);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAcceptEmptyString() {

        String s = "";
        findShort(s);
    }
}