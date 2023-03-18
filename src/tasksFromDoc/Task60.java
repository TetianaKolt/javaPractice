package tasksFromDoc;
/*
60. Return the Four Letter Strings
Create a function that takes an array of strings and returns the words that are exactly four letters.

Examples
isFourLetters(["Tomato", "Potato", "Pair"]) ➞ ["Pair"]
isFourLetters(["Kangaroo", "Bear", "Fox"]) ➞ ["Bear"]
isFourLetters(["Ryan", "Kieran", "Jason", "Matt"]) ➞ ["Ryan", "Matt"]

 */


import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class Task60 {
    public static void main(String[] args) {

        System.out.println(isFourLetters(new String[]{"Tomato", "Potato", "Pair"}));
        System.out.println(isFourLetters(new String[]{"Kangaroo", "Bear", "Fox"}));
        System.out.println(isFourLetters(new String[]{"Ryan", "Kieran", "Jason", "Matt"}));


    }

    public static List<String> isFourLetters(String[] words) {
        List<String> fourLetterWords = new ArrayList<String>(Arrays.asList(words));

// так не выйдет потому что смещается место i
//        for (int i = 0; i < fourLetterWords.size()-1; i++) {
//            while (fourLetterWords.get(i).length() != 4){
//                fourLetterWords.remove(fourLetterWords.get(i));
//            }

        for (int i = fourLetterWords.size() - 1; i >= 0; i--) {

            while (fourLetterWords.get(i).length() != 4) {
                fourLetterWords.remove(fourLetterWords.get(i));
                break;
            }
        }

        return fourLetterWords;
    }
}
