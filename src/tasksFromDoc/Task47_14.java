package tasksFromDoc;
/*
47.14 Alphabet Soup
Create a method that takes a string and returns a string with its letters in alphabetical order.

Examples
AlphabetSoup("hello") ➞ "ehllo"
AlphabetSoup("edabit") ➞ "abdeit"
AlphabetSoup("hacker") ➞ "acehkr"
AlphabetSoup("geek") ➞ "eegk"
AlphabetSoup("javascript") ➞ "aacijprstv"

Notes
You can assume numbers and punctuation symbols won't be included in test cases.
You'll only have to deal with single word, alphabetic characters.

 */

import java.util.Arrays;

public class Task47_14 {
    public static void main(String[] args) {
        System.out.println(alphabetSoup("hello"));
        System.out.println(alphabetSoup("edabit"));
        System.out.println(alphabetSoup("hacker"));
        System.out.println(alphabetSoup("geek"));
        System.out.println(alphabetSoup("javascript"));

    }

    public static String alphabetSoup(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        word = String.valueOf(chars);

        return word;
    }
}
