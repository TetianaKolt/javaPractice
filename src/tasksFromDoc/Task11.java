package tasksFromDoc;

/*
11. Return Something to Me!
Write a function that returns the string "something" joined with a space " " and the given argument a.

Examples
giveMeSomething("is better than nothing") ➞ "something is better than nothing"
giveMeSomething("Bob Jane") ➞ "something Bob Jane"
giveMeSomething("something") ➞ "something something"
 */

public class Task11 {
    public static void main(String[] args) {
        System.out.println(giveMeSomething("Bob Jane"));

    }

    public static String giveMeSomething(String a){

        return " " + "something" + " " + a;
    }
}
