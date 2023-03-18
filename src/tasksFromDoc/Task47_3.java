package tasksFromDoc;
/*
47.3 Double Letters
Create a function that takes a word and returns true if the word has two consecutive identical letters.

Examples
doubleLetters("loop") ➞ true
doubleLetters("yummy") ➞ true
doubleLetters("orange") ➞ false
doubleLetters("munchkin") ➞ false

 */

public class Task47_3 {
    public static void main(String[] args) {

        System.out.println(doubleLetters("loop"));
        System.out.println(doubleLetters("yummy"));
        System.out.println(doubleLetters("orange"));
        System.out.println(doubleLetters("munchkin"));

    }


    public static boolean doubleLetters(String myWord) {

        for (int i = 0; i < myWord.length(); i++) {
            for (int j = 1; j < myWord.length(); j++) {
                if (myWord.charAt(i) == myWord.charAt(j) && (i + 1) == j) {
//                    System.out.println( "i = " + myWord.charAt(i) + " j = " + myWord.charAt(j));
                    return true;
                }
            }
        }
        return false;
    }
}
