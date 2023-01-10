package generics;

public class Generics {
    public static void main(String[] args) {
        Integer[] intArr = new Integer[]{4,6,3,7,4};
        String[] strArr = new String[]{"apple", "banana", "orange"};

        printArr(intArr);
        printArr(strArr);
    }

    private static <T> void printArr(T[] intArr) {
        for (T integer: intArr){
            System.out.println(integer);
        }
    }
}
