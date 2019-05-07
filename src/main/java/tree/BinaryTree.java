package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    public Node root;

   public BinaryTree() {
        root = null;
    }
    public BinaryTree(int value) {
        root = new Node(value);
    }



//    preOrder(node) {
//      (input <- root node)
//        (output <- preorder output of tree nodes)

//        output <- node.value

//        if node.left != null
//        preOrder(node.left)

//        if node.right != null
//        preOrder(node.right)

//    }

//    inOrder(node) {
//        (input <- root node)
//        (output <- inorder output of tree nodes)
//
//                if node.left != null
//                inOrder(node.left)
//
//                output <- node.value
//
//                if node.right != null
//                inOrder(node.right)
//    }

//    postOrder(node) {
//        (input < -root node)
//        (output < -postorder output of tree nodes)
//
//
//        if node.left != null
//        inOrder(node.left)
//
//        if node.right != null
//        inOrder(node.right)
//
//        output node.value
//
//    }
    public List<Integer> preOrder () {
        ArrayList<Integer> list = new ArrayList<>();
        preOrder(root, list);
        return list;

    }
}