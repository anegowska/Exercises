package codewars;

import org.junit.Test;

import java.math.BigInteger;

import static codewars.EasyLine.easyLine;
import static org.junit.Assert.*;

public class EasyLineTest {

    @Test
    public void shouldReturnSumOfSquaresOnLine() {
        // given
        int num = 13;

        BigInteger expectedNum = BigInteger.valueOf(10400600);

        // when
        BigInteger result = easyLine(num);

        // then
        assertEquals(expectedNum, result);
    }
}