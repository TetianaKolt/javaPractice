package tasksFromDoc;
/*
47.13 Secret Society
A group of friends have decided to start a secret society.
The name will be the first letter of each of their names, sorted in alphabetical order.
Create a function that takes in an array of names and returns the name of the secret society.

Examples
societyName(["Adam", "Sarah", "Malcolm"]) ➞ "AMS"
societyName(["Harry", "Newt", "Luna", "Cho"]) ➞ "CHLN"
societyName(["Phoebe", "Chandler", "Rachel", "Ross", "Monica", "Joey"]) ➞ "CJMPRR"

Notes
The secret society's name should be entirely uppercased.

 */

import java.util.Arrays;



public class Task47_13 {

    public static void main(String[] args) {
        System.out.println(societyName(new String[]{"Adam", "Sarah", "Malcolm"}));
        System.out.println(societyName(new String[]{"Harry", "Newt", "Luna", "Cho"}));
        System.out.println(societyName(new String[]{"Phoebe", "Chandler", "Rachel", "Ross", "Monica", "Joey"}));

    }

    public static String societyName(String[] names) {
        String societyName = "";

        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].substring(0,1);
            societyName = societyName.concat(names[i]);
        }
        char[] chars = societyName.toCharArray();
        Arrays.sort(chars);

        return String.valueOf(chars).toUpperCase();
    }

}
