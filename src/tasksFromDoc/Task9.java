package tasksFromDoc;
/*
9. Is the Number Less than or Equal to Zero?
Create a method that takes an integer as its only argument and returns true if it's less than or equal to zero, otherwise return false.

Examples:
lessThanOrEqualToZero(5) ➞ false
lessThanOrEqualToZero(0) ➞ true
lessThanOrEqualToZero(-2) ➞ true


 */

public class Task9 {
    public static void main(String[] args) {
        System.out.println(lessThanOrEqualToZero(-2));

    }

    public static boolean lessThanOrEqualToZero(int a){
        if (a<=0){
            return true;
        }
        else {
            return false;
        }
    }
}

