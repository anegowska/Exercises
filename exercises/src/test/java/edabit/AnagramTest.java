package edabit;

import org.junit.Test;

import static edabit.Anagram.isAnagram;
import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void returnTrueWhenIsAnagram() {
        //given
        String s1 = "Dave Barry";
        String s2 = "Ray Adverb";

        // when
        boolean result = isAnagram(s1,s2);

        // then
        assertTrue(result);
    }

    @Test
    public void returnFalseWhenIsNotAnagram() {
        //given
        String s1 = "Apple";
        String s2 = "Appeal";

        // when
        boolean result = isAnagram(s1,s2);

        // then
        assertFalse(result);
    }
}