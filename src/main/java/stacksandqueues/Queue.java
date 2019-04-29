package stacksandqueues;

public class Queue {
    public Node front;
    public Node rear;
    public Node temp;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    //if queue is null, make new value the front, else insert new value to new node.
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (this.rear == null) {
            this.rear = newNode;
            newNode.next = null;
        } else {
            newNode.next = this.rear;
            this.rear = newNode;
        }
    }

    //remove node from front of queue and return nodes's value
    public Node dequeue() {
        if (front == null) {

            Node temp = null;
            front = front.next;
            temp.next = null;
        }
            return temp;
    }

    //return value of node at front of queue
    public Node peek() {
        return front;
    }
}
