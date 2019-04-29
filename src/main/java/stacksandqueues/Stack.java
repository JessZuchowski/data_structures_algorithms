package stacksandqueues;

public class Stack {
    public Node top;
    public Node temp;

    public Stack () {
        this.top = null;
    }

    //if stack is null, make new value the top, else insert new value to new node.
    public void push(int value) {
        Node newNode = new Node(value);
        if ( this.top == null) {
            this.top = newNode;
            newNode.next = null;
        } else {
            newNode.next = this.top;
            this.top = newNode;
        }
    }

    //remove node from top of stack and return node's value
    public Node pop() {
        if (top == null) {

            Node temp = null;
            top = top.next;
            temp.next = null;
        }
        return temp;
    }

    //return value of node on top of stack
    public Node peek() {
        return top;
    }
}
