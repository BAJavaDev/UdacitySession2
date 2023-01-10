package generics;

public class GenericClass {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(10);
        integerBox.add(30);
        integerBox.add(50);
        stringBox.add(new String("Hello"));
        stringBox.add(new String("World"));
        stringBox.add(new String("!!"));

        for(String strBox: stringBox.getBoxes()){
            System.out.println(strBox.toUpperCase());
        }

    }
}
