package tasksFromDoc;
/*
71. Create map. Add some values.
- get all keys as ArrayList
- get all values as ArrayList

 */

import java.util.HashMap;
import java.util.Map;

public class Task71 {
    public static void main(String[] args) {
        Map<Integer, String> cats = new HashMap<>();
        cats.put(1, "Simon");
        cats.put(2, "Dexter");
        cats.put(3, "Amour");

        System.out.println("Keys are: " + cats.keySet());
        System.out.println("Values are: " + cats.values());
    }


}
