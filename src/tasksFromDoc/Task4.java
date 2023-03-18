package tasksFromDoc;

/*
4. Are the Numbers Equal?
Create a function that returns true when x is equal to y; otherwise return false.

Examples
isSameNum(4, 8) ➞ false
isSameNum(2, 2) ➞  true
isSameNum(42, 32) ➞  false
 */

public class Task4 {
    public static void main(String[] args) {

        System.out.println(equalNum(42, 42));
    }

    public static boolean equalNum(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

}
