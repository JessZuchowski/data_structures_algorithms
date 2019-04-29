package stacksandqueues;

public class Stack {
    public Node top;

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
}
