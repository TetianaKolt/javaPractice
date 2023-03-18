package tasksFromDoc;

/*
18. Flip the Boolean
Create a function that reverses a boolean value.

Examples
reverse(true) ➞ false
reverse(false) ➞ true

 */

public class Task18 {
    public static void main(String[] args) {
        System.out.println(reverse(true));
        System.out.println(reverse(false));
    }

    public static boolean reverse(boolean a) {

        return (!a);
    }
}
