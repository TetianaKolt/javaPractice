package tasksFromDoc;
/*
2.Convert Minutes into Seconds
Write a function that takes an integer minutes and converts it to seconds.

Examples
convert(5) ➞ 300
convert(3) ➞ 180
convert(2) ➞ 120
 */

public class Task2 {
    public static void main(String[] args) {

        System.out.println(convertMinToSec(3));

    }

    public static int convertMinToSec (int min){
        int sec = min*60;
        return sec;
    }
}

