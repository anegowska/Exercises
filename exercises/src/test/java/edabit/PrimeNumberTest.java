package edabit;

import org.junit.Test;

import static edabit.PrimeNumber.isPrime;
import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void shouldReturnTrueWhenInputNumberIsPrime() {
        // given
        int num = 11;

        // when
        boolean result = isPrime(num);

        // then
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenInputNumberIsLessThanTwo() {
        // given
        int num = 1;

        // when
        boolean result = isPrime(num);

        // then
        assertFalse(result);
    }
}