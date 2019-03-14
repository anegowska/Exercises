package codewars;

import org.junit.Test;

import static codewars.DigitsPowers.digPow;
import static org.junit.Assert.*;

public class DigitsPowersTest {

    @Test
    public void shouldReturnPositiveInteger() {
        // given
        int num = 46288;
        int pow = 3;

        long expectedNum = 51;

        // when
        long result = digPow(num, pow);

        // then
        assertEquals(expectedNum, result);
    }

    @Test
    public void shouldReturnMinusOne() {
        // given
        int num = 92;
        int pow = 1;

        long expectedNum = -1;

        // when
        long result = digPow(num, pow);

        // then
        assertEquals(expectedNum, result);
    }
}