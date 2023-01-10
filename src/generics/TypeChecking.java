package generics;

import java.util.ArrayList;
import java.util.List;

public class TypeChecking {
    public static void main(String[] args) {
        List strList = new ArrayList<>();
        strList.add("bob");
        strList.add("jeff");
        strList.add("charlie");
        //strList.add(6);

        for (Object string : strList){
            System.out.println(((String)string).toUpperCase());
        }

        String str1 = (String) strList.iterator().next();

    }
}
