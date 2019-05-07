package challenges.FizzBuzzTree;

import tree.Node;

public class FizzBuzzTree {

    //just tree so far, need to change if statement returns to change values
    public tree.Node root;

    //    insertion: recursive method to add value to left if less than current, add to right if greater than
    public tree.Node addRecursive(tree.Node current, int value) {
        if (current == null) {
            return new tree.Node(value);
        }
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value >= current.value) {
            current.right = addRecursive(current.right, value);
        }
//        else {
//            return current;
//        }
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
