package tasksFromDoc;
/*
70. Create map. Add some values. Write a Java program to check whether a map contains key-value pair.
 */

import java.util.Arrays;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;

public class Task70 {
    public static void main(String[] args) {
        ///// String is the key
//        Map<String, Integer> droids = new HashMap<>();
//        droids.put("Repair Droid" , 100);
//        droids.put("Battle Droid", 500);
//        droids.put("Super Battle Droid", 1000);
//
//        System.out.println(droids.entrySet());

        Map<Integer, String> droidsCodes = new HashMap<>();
        droidsCodes.put(123, "Repair Droid");
        droidsCodes.put(234, "Battle Droid");
        droidsCodes.put(456, "Super Battle Droid");

        System.out.println(droidsCodes.entrySet());
        System.out.println(containsKeyValuePair(droidsCodes, 123, "Repair Droid"));

    }


    public static boolean containsKeyValuePair(Map map, Integer key, String value) {
        Set keyValueSets = map.entrySet();
        String[] kKeys;


        if (map.isEmpty()) {
            throw new IllegalArgumentException("This map is empty");
        }

        if (map.containsKey(key) && map.containsValue(value)) {
            for (Object keyValue : keyValueSets) {
                kKeys = String.valueOf(keyValue).split("=");

                if (kKeys[0].equals(String.valueOf(key)) && kKeys[1].equals(value)) {
                    return true;
                }
            }
        }

        return false;
    }
}
