package codewars;

import org.junit.Test;

import static codewars.TripleTrouble.tripleDouble;
import static org.junit.Assert.*;

public class TripleTroubleTest {

    @Test
    public void shouldReturnOne() {
        //given
        long num1 = 451999277;
        long num2 = 477722899;

        int expected = 1;

        // when
        int result = tripleDouble(num1, num2);

        // then
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnZero() {
        //given
        long num1 = 1112387;
        long num2 = 12233567;

        int expected = 0;

        // when
        int result = tripleDouble(num1, num2);

        // then
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnZeroWhenTheSameNumbers() {
        //given
        long num1 = 123456;
        long num2 = 123456;

        int expected = 0;

        // when
        int result = tripleDouble(num1, num2);

        // then
        assertEquals(expected, result);
    }
}