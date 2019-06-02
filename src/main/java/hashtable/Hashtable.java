package hashtable;

import java.util.ArrayList;
import java.util.List;

public class Hashtable {

    //basic hash
    public static int hash(String key) {
        char[] array = key.toCharArray();

        int index = 0;
        for(char c : array) {
            index += c;
        }
        return index * 599;
    }
    //hashbucket, need to account for collisions
    static String[] bucket = new String[17];

    public static class KeyValuePair {
        public String key;
        public String value;
    }

    //add values to buckets using keys
    public static void add(String key, String value) {
        int hash = hash(key);

        //use modulo to ensure we stay within the length of the buckets
        int index = hash % bucket.length;

        bucket[index] = value;
    }
    //get value from bucket based on keys
    public static String get(String key) {
        int hash = hash(key);
        int index = hash % bucket.length;

        return bucket[index];
    }
}
