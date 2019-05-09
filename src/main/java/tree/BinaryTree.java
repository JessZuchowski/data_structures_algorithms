package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    public Node root;

public void preOrder(Node node, int value) {
    if (node == null)
        return;
        System.out.println(value);
        preOrder(node.left, value);
        preOrder(node.right, value);

    }

public void inOrder(Node node, int value) {
    if (node == null)
        return;
    inOrder(node.left, value);
    System.out.println(value);
    inOrder(node.right, value);
}

public void postOrder(Node node, int value) {
    if (node == null)
        return;
    postOrder(node.left, value);
    postOrder(node.right, value);
    System.out.println(value);
}

public void findMaximumValue() {
    
}
}