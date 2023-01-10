package advanced.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        final Queue<String> groceryLine = new LinkedList<>();
        groceryLine.add("Sally");
        groceryLine.add("George");
        groceryLine.add("James");

        while (!groceryLine.isEmpty()){
            System.out.println(groceryLine.poll());
        }
    }
}
