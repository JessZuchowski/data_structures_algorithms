package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void testConstructor() {
        Queue test = new Queue();
        assertEquals(null, test.front);
    }

    @Test
    public void testEnqueue() {
        Queue test = new Queue();

        test.enqueue(3);
        assertEquals(3, test.front.value);
        assertEquals(null, test.front.next);

        test.enqueue(4);
        assertEquals(4, test.front.value);
        assertEquals(3, test.front.next);
        assertEquals(null, test.front.next.next);

        test.enqueue(5);
        assertEquals(5, test.front.value);
        assertEquals(4, test.front.next.value);
        assertEquals(3, test.front.next.next.value);
    }
}