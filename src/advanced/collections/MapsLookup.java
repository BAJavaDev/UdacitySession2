package advanced.collections;

import java.util.HashMap;
import java.util.Map;

public class MapsLookup {
    public static void main(String[] args) {
        final Map<String, User> usernameToUserMap = new HashMap<>();
        usernameToUserMap.put("balleyn", new User("balleyn","strongpassword", "785875875"));
        usernameToUserMap.put("bigdev", new User("bigdev","encrypted", "89787875"));
        usernameToUserMap.put("udacity", new User("udacity","taught", "8988875"));

        // Direct access to keys (O(1))
        User user = usernameToUserMap.get("balleyn");
        System.out.println(user.getPassword());
    }
}
