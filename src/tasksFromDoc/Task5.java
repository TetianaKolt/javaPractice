package tasksFromDoc;

/*
5. Convert Hours into Seconds
Write a function that converts hours into seconds.

Examples
howManySeconds(2) ➞ 7200
howManySeconds(10) ➞ 36000
howManySeconds(24) ➞ 86400
 */

public class Task5 {
    public static void main(String[] args) {
        System.out.println(hoursToSec(24));
    }

    public static int hoursToSec (int hours){
        int sec = hours*60*60;

        return sec;
    }
}
