package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void testConstructor() {
        BinarySearchTree test = new BinarySearchTree();
        assertEquals(null, test.root);
    }

    @Test
    public void addRecursive() {
        BinarySearchTree bst = new BinarySearchTree();

        bst.add(7);
        assertEquals(7, bst.root.value);

        bst.add(3);
        assertEquals(3, bst.root.left.value);

        bst.add(9);
        assertEquals(9, bst.root.right.value);

    }

    @Test
    public void add() {
        BinarySearchTree bst1 = new BinarySearchTree();

        bst1.add(4);
        assertEquals(4, bst1.root.value);

        bst1.add(2);
        assertEquals(2, bst1.root.left.value);

        bst1.add(6);
        assertEquals(6, bst1.root.right.value);

    }

    @Test
    public void contains() {
        BinarySearchTree bst2 = new BinarySearchTree();
        bst2.add(3);
        bst2.add(5);

        assertTrue(bst2.contains(3));
        assertTrue(bst2.contains(5));


        assertFalse(bst2.contains(4));
        assertFalse(bst2.contains(6));


    }
}