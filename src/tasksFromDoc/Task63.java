package tasksFromDoc;
/*
63. Letters Only
Write a function that removes any non-letters from a string, returning a well-known film title.

Examples
lettersOnly("R!=:~0o0./c&}9k`60=y") ➞ "Rocky"
lettersOnly("^,]%4B|@56a![0{2m>b1&4i4") ➞ "Bambi"
lettersOnly("^U)6$22>8p).") ➞ "Up"

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task63 {
    public static void main(String[] args) {
        System.out.println(lettersOnly("R!=:~0o0./c&}9k`60=y"));
        System.out.println(lettersOnly("^,]%4B|@56a![0{2m>b1&4i4"));
        System.out.println(lettersOnly("^U)6$22>8p)."));

    }

    public static String lettersOnly(String str){
    List<Character> lettersOnly = new ArrayList<Character>();
    String letters = "";

        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))){
                lettersOnly.add(str.charAt(i));
            }
        }

        for (int i = 0; i < lettersOnly.size(); i++) {
            letters = letters.concat(String.valueOf(lettersOnly.get(i)));
        }

        return letters;
    }
}
