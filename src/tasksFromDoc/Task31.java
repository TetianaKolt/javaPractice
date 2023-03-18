package tasksFromDoc;

/*
31. Hello; Hello World; World
Write a function that takes an integer and:
If the number is a multiple of 3, return "Hello".
If the number is a multiple of 5, return "World".
If the number is a multiple of both 3 and 5, return "Hello World".

Examples
helloWorld(3) ➞ "Hello"
helloWorld(5) ➞ "World"
helloWorld(15) ➞ "Hello World"


 */

public class Task31 {
    public static void main(String[] args) {
        System.out.println(helloWorld(3));
        System.out.println(helloWorld(5));
        System.out.println(helloWorld(15));
        System.out.println(helloWorld(11));
    }

    public static String helloWorld(int a) {
        if (a % 5 == 0 && a% 3 == 0) {
            return "Hello World";
        }
        else if (a % 3 == 0) {
            return "hello";
        } else if (a % 5 == 0) {
            return "world";
        }
        return null;
    }
}

