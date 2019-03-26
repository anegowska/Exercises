package codewars;

import org.junit.Test;

import static codewars.HumanReadableTime.makeReadable;
import static org.junit.Assert.*;

public class HumanReadableTimeTest {

    @Test
    public void shouldReturnReadableTime() {
        //given
        int seconds = 86399;
        String expectedresult = "23:59:59";

        // when
        String result = makeReadable(seconds);

        // then
        assertEquals(expectedresult, result);
    }

    @Test
    public void shouldReturnMaxReadableTime() {
        //given
        int seconds = 360000;
        String expectedresult = "99:59:59";

        // when
        String result = makeReadable(seconds);

        // then
        assertEquals(expectedresult, result);
    }
}