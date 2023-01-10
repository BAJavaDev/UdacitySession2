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

        for (String fruit: set){
            System.out.println(fruit);
        }

    }
}
