package challenges.treeIntersection;

import java.util.Stack;

public class TreeIntersection {
    //create new node
    public static Node newNode(int value) {
        Node temp = new Node();
        temp.key = value;
        temp.left = null;
        temp.right = null;
        return temp;
    }

    public static void treeIntersection(Node tree1, Node tree2) {
        Stack<Node> stack = new Stack<>();
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        while (true) {
            if (tree1 != null) {
                stack1.push(tree1);
                tree1 = tree1.left;
            }
            else if (tree2 != null) {
                stack2.push(tree2);
                tree2 = tree2.left;
            }
            else if (!stack1.isEmpty() && !stack2.isEmpty()) {
                tree1 = stack1.peek();
                tree2 = stack2.peek();

                if (tree1.key == tree2.key) {
                    stack1.pop();
                    stack2.pop();

                    tree1 = tree1.right;
                    tree2 = tree2.right;
                }
                else if (tree1.key < tree2.key) {
                    stack1.pop();
                    tree1 = tree1.right;
                    tree2 = null;
                }
                else if (tree1.key > tree2.key) {
                    stack2.pop();
                    tree2 = tree2.right;
                    tree1 = null;
                }
            }
            else break;
        }
    }
    public static Node insert(Node node, int key) {
        if (node == null) {
            return newNode(key);
        }
        if (key < node.key) {
            node.left = insert(node.left, key);
        }
        else if (key > node.key) {
            node.right = insert(node.right, key);
        }
        return node;
    }
}
