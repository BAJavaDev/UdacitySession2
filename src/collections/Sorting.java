package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        final List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alleyne",172, 30));
        persons.add(new Person("Tom",160, 22));
        persons.add(new Person("Alleyne",155, 42));
        persons.add(new Person("John",180, 27));
        persons.add(new Person("Sam",164, 18));

        System.out.println("Original List");
        displayList(persons);
        // Sort using Comparable inside the Person class. Sorts by age.
        Collections.sort(persons);
        System.out.println("\nSorted by age");
        displayList(persons);

        // Sort using external Comparator class
        Collections.sort(persons,new PersonNameCompare());
        System.out.println("\nSorted by name");
        displayList(persons);

    }

    private static void displayList(List<Person> persons) {
        for(Person person: persons){
            System.out.print("Name: " + person.getName() + ", ");
            System.out.print("Height: " + person.getHeight() + ", ");
            System.out.print("Age: " + person.getAge());
            System.out.println();
        }
    }
}
