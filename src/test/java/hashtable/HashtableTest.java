package hashtable;

import java.util.ArrayList;
import java.util.List;

import static hashtable.Hashtable.add;
import static hashtable.Hashtable.get;
import static org.junit.Assert.*;

public class HashtableTest {


    public static void main(String[] args) {
        //create some hashes
        System.out.println("weevil".hashCode());
        System.out.println("junebug".hashCode());
        System.out.println("stinkbug".hashCode());

        //linked list to account for collisions
        List<String>[] bucket = new ArrayList[1024];

        add("rose", "weevil");
        System.out.println(get("rose"));

        add("stripe", "junebug");
        System.out.println(get("stripe"));

        add("bug", "stinkbug");
        System.out.println(get("bug"));

        //collision test
        add("gub", "what's a gub?");
        System.out.println(get("bug"));
    }

}