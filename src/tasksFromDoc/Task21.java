package tasksFromDoc;

/*
21. Divides Evenly
Given two integers, a and b, return true if a can be divided evenly by b. Return false otherwise.

Examples
dividesEvenly(98, 7) ➞ true  98/7 = 14
dividesEvenly(85, 4) ➞ false 85/4 = 21.25
 */

public class Task21 {
    public static void main(String[] args) {

        System.out.println(dividesEvenly(98, 7));
        System.out.println(dividesEvenly(85, 4));
    }

    public static boolean dividesEvenly(double a, double b) {
        return a%b == 0;
    }
}

