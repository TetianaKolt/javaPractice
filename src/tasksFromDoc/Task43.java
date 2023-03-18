package tasksFromDoc;

import java.util.Arrays;
import java.util.Collections;

/*
43. Is the String a Palindrome?
A palindrome is a word that is identical forward and backwards.
mom
racecar
kayak
Given a word, create a function that checks whether it is a palindrome.

Examples
checkPalindrome("mom") ➞ true
checkPalindrome("scary") ➞ false
checkPalindrome("reviver") ➞ true
checkPalindrome("stressed") ➞ false
 */
public class Task43 {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("mom"));
        System.out.println(checkPalindrome("scary"));
        System.out.println(checkPalindrome("reviver"));
        System.out.println(checkPalindrome("stressed"));

    }

    public static boolean checkPalindrome(String str) {
        String [] str1 = str.split("");
        Collections.reverse(Arrays.asList(str1));
        String str2 = String.join("", str1);

        return str.equalsIgnoreCase(str2);
    }


}

