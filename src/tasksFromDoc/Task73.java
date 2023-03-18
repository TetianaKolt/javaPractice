package tasksFromDoc;
/*
73. Too many animals
Given the list of following animals: "zebra", "wolf", "rabbit", "wolf", "monkey", "pig", "horse", "zebra"
- remove duplicates from list
- sort list DESC
- get longest and shortest string from list

 */

import java.util.*;

public class Task73 {
    public static void main(String[] args) {
        /// ArrayList<String> animals = (ArrayList<String>)Arrays.asList("zebra", "wolf", "rabbit", "wolf", "monkey", "pig", "horse", "zebra");
        LinkedList<String> animals = new LinkedList<>(Arrays.asList("zebra", "wolf", "rabbit",
                "wolf", "monkey", "pig",
                "horse", "zebra"));

        System.out.println(removeDuplicates(animals));

        System.out.println(getTheLongestString(removeDuplicates(animals)));

        System.out.println(getTheShortestString(removeDuplicates(animals)));


    }

    public static LinkedList<String> removeDuplicates(LinkedList<String> yourCollection) {

        LinkedList<String> unique = new LinkedList<>();

        for (String s : yourCollection) {
            if (!unique.contains(s)) {
                unique.add(s);
            }
        }

        Collections.sort(unique);
        Collections.reverse(unique);

        return unique;
    }

    public static String getTheLongestString(LinkedList<String> yourCollection) {
        String theLongestString = null;
        int j = yourCollection.size() - 1;
        for (int i = 0; i < yourCollection.size(); i++) {
            if (yourCollection.get(i).length() > yourCollection.get(j).length()) {
                theLongestString = yourCollection.get(i);
            }
            j--;
        }
        return theLongestString;
    }

    public static String getTheShortestString(LinkedList<String> yourCollection) {
        String theShortestString = null;
        int j = yourCollection.size() - 1;
        for (int i = 0; i < yourCollection.size(); i++) {
            if (yourCollection.get(i).length() < yourCollection.get(j).length()) {
                theShortestString = yourCollection.get(i);
            }
            j--;
        }
        return theShortestString;
    }
}
