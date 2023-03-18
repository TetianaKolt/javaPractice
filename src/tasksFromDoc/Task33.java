package tasksFromDoc;

/*
33. Check if String Ending Matches Second String
Create a function that takes two strings and returns true if the first string ends with the second string;
otherwise return false.

Examples
checkEnding("abc", "bc") ➞ true
checkEnding("abc", "d") ➞ false
checkEnding("samurai", "zi") ➞ false
checkEnding("feminine", "nine") ➞ true
checkEnding("convention", "tio") ➞ false
 */

public class Task33 {
    public static void main(String[] args) {

        System.out.println(checkEnding("abc", "bc"));
        System.out.println(checkEnding("abc", "d"));
        System.out.println(checkEnding("samurai", "zi"));
        System.out.println(checkEnding("feminine", "nine"));
        System.out.println(checkEnding("convention", "tio"));
        System.out.println("****");
        System.out.println(checkEndingF("abc", "bc"));
        System.out.println(checkEndingF("abc", "d"));

    }

    public static boolean checkEnding(String a, String b) {

        return a.endsWith(b);
    }

    public static boolean checkEndingF(String a, String b) {
        for (int i = 0; i < b.length(); i++) {
            if(b.charAt(b.length()-1-i) != a.charAt(a.length()-1-i))
                return false;
        }
        return true;
    }
}


