package tree;

public class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {

        this.value = value;
        left = null;
        right = null;

        //methods needed: getValue(), getLeft(), getRight()
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public int getValue() {
        return value;
    }
}
