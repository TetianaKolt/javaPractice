package tasksFromDoc;


/*
24. Is the String Empty?
Create a function that returns true if a string is empty and false otherwise.

Examples
isEmpty("") ➞ true
isEmpty(" ") ➞ false
isEmpty("a") ➞ false
 */
public class Task24 {
    public static void main(String[] args) {
        System.out.println(isEmpty(""));
        System.out.println(isEmpty(" "));
        System.out.println(isEmpty("a"));
    }

    public static boolean isEmpty(String a) {
        return a.isEmpty();
//        return a.length() == 0;
    }
}


