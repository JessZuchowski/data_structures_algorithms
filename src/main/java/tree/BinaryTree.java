package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

public void findMaximumValue(Node root) {
    if (root != null) {
        Queue<Node> q = new LinkedList<>();
        Node max = root;
        q.add(root);
        while(q.size() != 0) {
            Node temp = q.remove();
            if (temp.getValue() > max.getValue())
                max = temp;
            if (temp.getLeft() != null)
                q.add(temp.getLeft());
            if (temp.getRight() != null)
                q.add(temp.getRight());
        }
        System.out.println(max.getValue());
    }

}
}