package data_structures.LinkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testConstructor() {
        LinkedList test = new LinkedList();
        assertEquals(null, test.head);
    }

    @Test
    public void testInsert() {
        LinkedList test = new LinkedList();
        test.insert(5);
        assertEquals(5, test.head.value);
        assertEquals(null, test.head.next);

        test.insert(7);
        assertEquals(7, test.head.value);
        assertEquals(5, test.head.next.value);
        assertEquals(null, test.head.next.next);

        test.insert(9);
        assertEquals(9, test.head.value);
        assertEquals(7, test.head.next.value);
        assertEquals(5, test.head.next.next.value);
    }



}