package generics;

public class NonGeneric {
    public static void main(String[] args) {
        Integer[] intArr = new Integer[]{4,6,3,7,4};
        String[] strArr = new String[]{"apple", "banana", "orange"};

        printArr(intArr);
        printArr(strArr);
    }

    private static void printArr(Integer[] intArr) {
        for (Integer integer: intArr){
            System.out.println(integer);
        }
    }

    private static void printArr(String[] strArr) {
        for (String s: strArr){
            System.out.println(s);
        }
    }
}
