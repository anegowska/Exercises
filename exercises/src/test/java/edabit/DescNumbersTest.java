package edabit;

import org.junit.Test;

import static edabit.DescNumbers.sortDesc;
import static org.junit.Assert.*;

public class DescNumbersTest {

    @Test
    public void shouldReturnDigitsInDescendingOrder() {
        // given
        long num = 59603;

        long expectedNum = 96530;

        // when
        long result = sortDesc(num);

        // then
        assertEquals(result, expectedNum);
    }

    @Test
    public void shouldReturnZeroWhenInputNumberIsNegative() {
        // given
        long num = -2719;

        long expectedNum = 0;

        // when
        long result = sortDesc(num);

        // then
        assertEquals(result, expectedNum);
    }

}