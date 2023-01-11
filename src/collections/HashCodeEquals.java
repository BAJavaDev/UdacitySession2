package collections;

public class HashCodeEquals {
    public static void main(String[] args) {
        Person2 person1 = new Person2("bret", 64, 22);
        Person2 person2 = new Person2("bret", 64, 22);

        if(person1.equals(person2)){
            System.out.println("persons are equal");
        } else {
            System.out.println("persons are not equal");
        }
    }
}
