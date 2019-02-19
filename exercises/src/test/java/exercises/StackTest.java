package exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void shouldReturnTrueWhenStackIsEmpty() {
        // given
        Stack stack = new Stack(5);

        // when
        boolean result = stack.isEmpty();

        // then
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenStackIsFull() {
        // given
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // when
        boolean result = stack.isFull();

        // then
        assertTrue(result);
    }

    @Test
    public void shouldReduceStackSizeByOne() {
        // given
        Stack stack = new Stack(10);
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);
        stack.pop();
        int expectedSize = 3;

        // when
        int result = stack.getSize();

        // then
        assertEquals(expectedSize, result);
    }
}