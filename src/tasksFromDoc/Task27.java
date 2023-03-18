package tasksFromDoc;

/*
27. Check String for Spaces
Create a function that returns true if a string contains any spaces.

Examples
hasSpaces("hello") ➞ false
hasSpaces("hello, world") ➞ true
hasSpaces(" ") ➞ true
hasSpaces("") ➞ false
hasSpaces(",./!@#") ➞ false
 */

public class Task27 {
    public static void main(String[] args) {

        System.out.println(hasSpaces("hello"));
        System.out.println(hasSpaces("hello, world"));
        System.out.println(hasSpaces(" "));
        System.out.println(hasSpaces(""));
        System.out.println(hasSpaces(",./!@#"));

    }

    public static boolean hasSpaces(String a) {

        return a.contains(" ");
    }

    public static boolean hasSpacesTwo(String a) {
        for (char ch : a.toCharArray()) {
            if (ch == ' ') {
                return true;
            }
        }
        return false;
    }
}
