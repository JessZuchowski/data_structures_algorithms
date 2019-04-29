package stacksandqueues;

public class Queue {
    public Node front;

    public Queue() {
        this.front = null;
    }

    //if queue is null, make new value the front, else insert new value to new node.
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (this.front == null) {
            this.front = newNode;
            newNode.next = null;
        } else {
            newNode.next = this.front;
            this.front = newNode;
        }
    }
}
