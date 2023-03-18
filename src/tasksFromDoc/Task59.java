package tasksFromDoc;
/*
59. Between Words
Write a function that takes three string arguments (first, last, and word)
and returns true if word is found between first and last in the dictionary, otherwise false.

Examples
isBetween("apple", "banana", "azure") ➞ true
isBetween("monk", "monument", "monkey") ➞ true
isBetween("bookend", "boolean", "boost") ➞ false

 */

import java.util.Arrays;

public class Task59 {
    public static void main(String[] args) {
        System.out.println(isBetween("apple", "banana", "azure"));
        System.out.println(isBetween("monk", "monument", "monkey"));
        System.out.println(isBetween("bookend", "boolean", "boost"));

    }

    public static boolean isBetween (String firstWord, String lastWord, String wordToFind) {
        // в массив и отсортировать

        String [] words = new String[]{firstWord, lastWord, wordToFind};

        Arrays.sort(words);

        return words[1].equals(wordToFind);
    }

}
