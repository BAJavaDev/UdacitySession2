package advanced.collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        final Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("apple");
        set.add("apple");
        set.add("apple");
        set.add("apple");
        set.add("banana");

        // iterate over set
        for (String fruit: set){
            System.out.println(fruit);
        }

        // direct lookups (O(1))
        if(set.contains("apple")) {
            System.out.println("contains apple");
        } else{
            System.out.println("does not contain apple");
        }

    }
}
