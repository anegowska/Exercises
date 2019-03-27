package codewars;

import org.junit.Test;

import static codewars.Mumbling.accum;
import static org.junit.Assert.*;

public class MumblingTest {

    @Test
    public void shouldReturnMumblingString() {
        //given
        String s = "ZpglnRxqenU";
        String expectedresult = "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu";

        // when
        String result = accum(s);

        // then
        assertEquals(expectedresult, result);
    }
}