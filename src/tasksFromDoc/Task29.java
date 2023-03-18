package tasksFromDoc;

/*
29. Case Insensitive Comparison
Write a function that validates whether two strings are identical. Make it case insensitive.

Examples
match("hello", "hELLo") ➞ true
match("motive", "emotive") ➞ false
match("venom", "VENOM") ➞ true
match("mask", "mAskinG") ➞ false

 */

public class Task29 {
    public static void main(String[] args) {
        System.out.println(match("hello", "hELLo"));
        System.out.println(match("motive", "emotive"));
        System.out.println(match("venom", "VENOM"));
        System.out.println(match("mask", "mAskinG"));
        System.out.println("*******");
        System.out.println(matchCompare("hello", "hELLo"));
        System.out.println(matchCompare("motive", "emotive"));
        System.out.println(matchCompare("venom", "VENOM"));
        System.out.println(matchCompare("mask", "mAskinG"));
    }

    public static boolean match(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        return a.equals(b);

    }
    public static boolean matchCompare(String a, String b) {

        return a.compareToIgnoreCase(b) == 0;
    }
}

