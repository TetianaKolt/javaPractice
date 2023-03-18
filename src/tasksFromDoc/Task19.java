package tasksFromDoc;

/*
19. Using the "&&" Operator
Java has a logical operator &&. The && operator takes two boolean values, and returns true if both values are true.

Examples
and(true, false) ➞ false
and(true, true) ➞ true
and(false, true) ➞ false
and(false, false) ➞ false
 */

public class Task19 {

    public static void main(String[] args) {
        System.out.println(addingBoolean(true,false));
        System.out.println(addingBoolean(true,true));
        System.out.println(addingBoolean(false,true));
        System.out.println(addingBoolean(false,false));

    }

    public static boolean addingBoolean(boolean a, boolean b) {

        return a&&b;
    }
}
