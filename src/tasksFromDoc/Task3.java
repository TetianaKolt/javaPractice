package tasksFromDoc;


/*
3. Return the Next Number from the Integer Passed
Create a function that takes a number as an argument, increments the number by +1 and returns the result.

Examples
addition(0) ➞ 1
addition(9) ➞ 10
addition(-3) ➞ -2
 */


public class Task3 {
    public static void main(String[] args) {

        System.out.println(nextNumber(-3));
        System.out.println(nextNumber(10));
    }

    public static int nextNumber(int a) {
//        a++;
        return ++a;
    }

}
