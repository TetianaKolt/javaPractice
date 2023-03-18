package tasksFromDoc;

/*
17. Check if an Integer is Divisible By Five
Create a function that returns true if an integer is evenly divisible by 5, and false otherwise.

Examples
divisibleByFive(5) ➞ true
divisibleByFive(-55) ➞ true
divisibleByFive(37) ➞ false

 */

public class Task17 {
    public static void main(String[] args) {
        System.out.println(divisibleByFive(7));
        System.out.println(divisibleByFive(15));
        System.out.println(divisibleByFive(-25));
        System.out.println(divisibleByFive(-8));
    }

    public static boolean divisibleByFive(int a) {

        return (a%5 == 0);
    }
}
