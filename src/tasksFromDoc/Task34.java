package tasksFromDoc;


import java.util.Arrays;
import java.util.Collections;

/*
34. Shuffle the Name
Create a method that accepts a string (of a person's first and last name) and returns a string with the first
and last name swapped.

Examples
nameShuffle("Donald Trump") ➞ "Trump Donald"
nameShuffle("Rosie O'Donnell") ➞ "O'Donnell Rosie"
nameShuffle("Seymour Butts") ➞ "Butts Seymour"
 */
public class Task34 {
    public static void main(String[] args) {
        System.out.println(nameShuffle("Donald Trump"));
        System.out.println(nameShuffle("Rosie O'Donnell"));
        System.out.println(nameShuffle("Seymour Butts"));

    }

    public static String nameShuffle(String a) {
        String[] b = a.split(" ");
        System.out.println(Arrays.toString(b));
        Collections.reverse(Arrays.asList(b));
        System.out.println(Arrays.toString(b));
        return String.join(" ", b);
    }
}

