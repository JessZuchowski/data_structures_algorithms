package hashtable;

import java.util.ArrayList;

public class HashtableGeneric<Key, Value> {
    //bucket array to store nodes
    ArrayList<HashNode<Key, Value>>bucket = new ArrayList<>();
    int bucketsNumber = 17;
    int size;


    public HashtableGeneric() {
        for(int i =0; i < bucketsNumber; i++) {
            bucket.add(null);
        }
    }
    public int getSize() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    private int getIndex(Key key) {
        int hash = key.hashCode();
        return hash % bucketsNumber;
    }
    //takes in key and returns value from table
    public Value get(Key key) {
        int index = getIndex(key);
        HashNode<Key, Value> head = bucket.get(index);
        while(head != null) {
            if(head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    //takes in key and value and adds to table
    public void add(Key key, Value value) {
        int index = getIndex(key);
        System.out.println(index);
        HashNode<Key, Value> head = bucket.get(index);
        HashNode<Key, Value> toAdd = new HashNode<>();
        toAdd.key = key;
        toAdd.value = value;
        if (head == null) {
            bucket.set(index, toAdd);
            size++;
        } else {
            while (head != null) {
                if(head.key.equals(key)) {
                    head.value = value;
                    size++;
                    break;
                }
                head = head.next;
            }
            if (head == null) {
                head = bucket.get(index);
                toAdd.next = head;
                bucket.set(index, toAdd);
                size++;
            }
        }
    }
}
