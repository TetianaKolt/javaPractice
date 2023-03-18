package tasksFromDoc;

/*
26. Compare Strings by Count of Characters
Create a function that takes two strings as arguments and return either true or false
depending on whether the total number of characters in the first string is equal to
the total number of characters in the second string.

Examples
comp("AB", "CD") ➞ true
comp("ABC", "DE") ➞ false
comp("hello", "edabit") ➞ false
 */

public class Task26 {
    public static void main(String[] args) {

        System.out.println(comp("AB", "CD"));
        System.out.println(comp("ABC", "DE"));
        System.out.println(comp("hello", "edabit"));

    }

    public static boolean comp(String a, String b) {
        int iA = 0;
        int iB = 0;
        for (char ch : a.toCharArray()) {
            iA++;
        }

        for (char ch : b.toCharArray()) {
            iB++;
        }

        return iA == iB;
    }

    public static boolean compare(String a, String b){

        return a.length() == b.length();
    }
}

