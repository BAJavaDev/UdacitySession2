package advanced.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayLookup {
    public static void main(String[] args) {
        final List<User> userArr = new ArrayList<>();
        userArr.add(new User("balleyn","strongpassword", "785875875"));
        userArr.add(new User("bigdev","encrypted", "89787875"));
        userArr.add(new User("udacity","taught", "8988875"));

        for(User user: userArr){
            if (user.getUsername() == "balleyn"){
                System.out.println(user.getPassword());
            }
        }
    }
}
