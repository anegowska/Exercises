package codewars;

import org.junit.Test;

import static codewars.Palindrom.isPalindrom;
import static org.junit.Assert.*;

public class PalindromTest {

    @Test
    public void shoudReturnTrueIfIsPalindrom() {
        // given
        String str = "Kobyła ma mały bok";

        // when
        boolean result = isPalindrom(str);

        // then
        assertTrue(result);
    }

    @Test
    public void shoudReturnFalseIfIsNotPalindrom() {
        // given
        String str = "To nie jest palindrom";

        // when
        boolean result = isPalindrom(str);

        // then
        assertFalse(result);
    }
}