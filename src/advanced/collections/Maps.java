package advanced.collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        final Map<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("Apples", 5);
        fruitMap.put("Oranges", 7);
        fruitMap.put("Grapes", 100);

        if(fruitMap.containsKey("Corn")) {
            System.out.println("It's a fruit");
        } else {
            System.out.println("It is not a fruit");
        }

        System.out.println("Keys: ");
        for (String key: fruitMap.keySet()){
            System.out.println(key);
        }

        System.out.println("\nValues: ");
        for (Integer value: fruitMap.values()){
            System.out.println(value);
        }

        System.out.println("\nOriginal Map");
        for (Map.Entry<String, Integer> fruitCountsMap: fruitMap.entrySet()){
            System.out.println("key: " + fruitCountsMap.getKey() + "value: " +fruitCountsMap.getValue());
        }

        fruitMap.remove("Apples");
        System.out.println("\nApple removed");
        for (Map.Entry<String, Integer> fruitCountsMap: fruitMap.entrySet()){
            System.out.println("key: " + fruitCountsMap.getKey() + "value: " +fruitCountsMap.getValue());
        }
    }
}
