package tree;

public class BinarySearchTree {

    public Node root;

//    insertion: recursive method to add value to left if less than current, add to right if greater than
    public Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value >= current.value) {
            current.right = addRecursive(current.right, value);
        }

        return current;
    }

    //sets root if root is null
    public void add(int value) {

        root = addRecursive(root, value);
    }

    public boolean containsRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? containsRecursive(current.left, value)
                : containsRecursive(current.right, value);
    }

    public boolean contains(int value) {

        return containsRecursive(root, value);
    }
}
