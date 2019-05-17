package edabit;

import org.junit.Test;

import static edabit.PerfectNumber.checkPerfect;
import static org.junit.Assert.*;

public class PerfectNumberTest {

    @Test
    public void shouldReturnTrueIfIsPerfectNumber() {
        // given
        int num = 496;

        // when
        boolean result = checkPerfect(num);

        // then
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseIfIsNotPerfectNumber() {
        // given
        int num = 97;

        // when
        boolean result = checkPerfect(num);

        // then
        assertFalse(result);
    }
}