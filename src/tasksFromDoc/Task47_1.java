package tasksFromDoc;
/*
47.1 Remove Every Vowel from a String
Create a function that takes a string and returns a new string with all vowels removed.

Examples
removeVowels("I have never seen a thin person drinking Diet Coke.")
➞ " hv nvr sn  thn prsn drnkng Dt Ck."

removeVowels("We're gonna build a wall!")
➞ "W'r gnn bld  wll!"

removeVowels("Happy Thanksgiving to all--even the haters and losers!")
➞ "Hppy Thnksgvng t ll--vn th htrs nd lsrs!"

Notes
"y" is not considered a vowel.
Expect a valid string for all test cases.


 */


import java.util.Arrays;


public class Task47_1 {

    public static void main(String[] args) {

        System.out.println(removeVowels("I have never seen a thin person drinking Diet Coke."));
        System.out.println("Expected result : \" hv nvr sn  thn prsn drnkng Dt Ck.\"");
        System.out.println();
        System.out.println(removeVowels("We're gonna build a wall!"));
        System.out.println("Expected result : \"W'r gnn bld  wll!\"");
        System.out.println();
        System.out.println(removeVowels("Happy Thanksgiving to all--even the haters and losers!"));
        System.out.println("Expected result : \"Hppy Thnksgvng t ll--vn th htrs nd lsrs!\"");

    }

    public static String removeVowels(String text) {
        String vowels = "AaEeIiOoUu";
        String newString = text;

        for (char textChar:text.toCharArray()) {
            for (char vowel: vowels.toCharArray()) {
                if(textChar == vowel){
                    newString = newString.replace(String.valueOf(textChar), "");
                    break;
                }
            }
        }
        return newString;
    }

    //// нет пробелов в методе removeVowelsNoSpaces
    public static String removeVowelsNoSpaces(String str) {
        String[] vowels = new String[]{"a", "A", "e", "E", "i", "I", "o", "O", "u", "U"};

        return str.replaceAll(Arrays.toString(vowels), "");
    }
}
