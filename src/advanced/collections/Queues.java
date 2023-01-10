package advanced.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
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

        // Priority Queue sorts the numbers as they are entered. Implemented using a Heap
        final Queue<Integer> numbersByPriority = new PriorityQueue<>();
        numbersByPriority.add(3);
        numbersByPriority.add(1);
        numbersByPriority.add(20);
        numbersByPriority.add(0);

        System.out.println("\nPriority Queue");
        while (!numbersByPriority.isEmpty()){
            System.out.println(numbersByPriority.poll());
        }

    }
}
