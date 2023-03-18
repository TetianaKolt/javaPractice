package tasksFromDoc;
/*
62. Return the Index of All Capital Letters
Create a method that takes a single string as argument
and returns an ordered array containing the indices of all capital letters in the string.

Examples
indexOfCaps("eDaBiT") ➞ [1, 3, 5]
indexOfCaps("eQuINoX") ➞ [1, 3, 4, 6]
indexOfCaps("determine") ➞ []
indexOfCaps("STRIKE") ➞ [0, 1, 2, 3, 4, 5]
indexOfCaps("sUn") ➞ [1]

 */

import java.util.LinkedList;
import java.util.List;

public class Task62 {
    public static void main(String[] args) {

        System.out.println(indexOfCaps("eDaBiT"));
        System.out.println(indexOfCaps("eQuINoX"));
        System.out.println(indexOfCaps("determine"));
        System.out.println(indexOfCaps("STRIKE"));
        System.out.println(indexOfCaps("sUn"));

    }

    public static String indexOfCaps(String str) {
        List<Integer> indexes = new LinkedList<Integer>();
        char[] charsCapitalised = str.toUpperCase().toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == charsCapitalised[i]){
                indexes.add(i);
            }
        }


        return indexes.toString();
    }
}
