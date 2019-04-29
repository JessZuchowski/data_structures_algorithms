package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void testConstructor() {
        Stack test = new Stack();
        assertEquals(null, test.top);
    }

    @Test
    public void testPush() {
        Stack test = new Stack();

        test.push(1);
        assertEquals(1, test.top.value);
        assertEquals(null, test.top.next);

        test.push(2);
        assertEquals(2, test.top.value);
        assertEquals(1, test.top.next);
        assertEquals(null, test.top.next.next);

        test.push(3);
        assertEquals(3, test.top.value);
        assertEquals(2, test.top.next.value);
        assertEquals(1, test.top.next.next.value);
    }
}