package tasksFromDoc;

/*
12. Name Greeting!
Create a function that takes a name and returns a greeting in the form of a string.

Examples
helloName("Gerald") ➞ "Hello Gerald!"
helloName("Tiffany") ➞ "Hello Tiffany!"
helloName("Ed") ➞ "Hello Ed!"

 */

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Pls enter your name: ");
        System.out.println(greeting());

    }
    public static String greeting(){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        return "Hello, " + a;
    }
}

