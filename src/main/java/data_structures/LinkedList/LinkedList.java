package data_structures.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

    //fields
    public Node head;

    public LinkedList (){
        this.head = null;

    }

    //if list is null, make new value the head, else insert new value to new node.
    public void insert(int value) {
        Node newNode = new Node(value);
        if (this.head == null) {
            this.head = newNode;
            newNode.next = null;
        } else {
             newNode.next = this.head;
             this.head = newNode;
            }
        }

    //takes a value and returns boolean if that value exists as a node value.
    public boolean includes(int value) {

        if (this.head == null) {
            return false;
        }
        Node currentNode = this.head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return true;
            } else {
                currentNode = currentNode.next;
            }
        }
        return false;
    }
    //return collection of all current node values.
    public List<Integer> print() {
        Node currentNode = this.head;
        List<Integer> list = new ArrayList<>();
        while (currentNode != null) {
            System.out.println(currentNode.value);
            list.add(currentNode.value);
            currentNode = currentNode.next;
        }
        System.out.println(list);
        return list;
    }

    //code challenge 07 k-th from end
    public <T>  nullIndexSearch(int k, <T> linkedListGeorge) {
        <T> current = linkedListGeorge.head;
        ArrayList <T>  linkedListArrayList = new ArrayList<>();
        while (current != null) {
            linkeListArrayList.addCurrent;
            current = current.reference;
        }
        for (int i = linkedListArrayList.size; i > 0; i--) {
            if (i = k) {
                return current.value;
            }
        }
    }

    //code challenge 08 merged lists
    public Node mergedLists(Node nodeA, Node nodeB) {
        if (nodeA == null) {
            return nodeB;
        }
            else(nodeB == null)
                return nodeA;

            Node head;
            if (nodeA.data < nodeB.data) {
            head = nodeA;
            nodeA = nodeA.next;

            else {
                head = nodeB;
                nodeB = nodeB.next;
            }

            Node current = head;
            while ((nodeA != null) || (nodeB != null)) {
                if (nodeA == null) {
                    current.next = nodeB;
                    return head;
                    else if (nodeB == null) {
                        current.next = nodeA;
                        return head;
                    }
                if (nodeA.data < nodeB.data) {
                    current.next = nodeA;
                    current = current.next;
                    nodeA = nodeA.next;
                }
                else {
                    current.next = nodeB;
                    current = current.next;
                    nodeB = nodeB.next;
                }
                }
                current.next = null;
                return head;
            }
        }
    }
}
