package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Looping {
    public static void main(String[] args) {
        final List<String> shapes = new ArrayList<>();
        shapes.add("square");
        shapes.add("circle");
        shapes.add("rectangle");
        shapes.add("cuboid");
       // shapes.add(7);

        // iterating using Iterator
        System.out.println("Iterate using Iterator");
        final Iterator<String> shapeIter = shapes.iterator();
        while(shapeIter.hasNext()){
            String shape = shapeIter.next();
            System.out.println(shape.toUpperCase());
        }

        // iterating using for
        System.out.println("\nIterate using for loop");
        for (String shape: shapes) {
            System.out.println(shape.toUpperCase());
        }
    }
}