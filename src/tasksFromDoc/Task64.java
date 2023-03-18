package tasksFromDoc;
/*
64 The 3 Programmers Problem
You hired three programmers and you (hopefully) pay them.
Create a function that takes three numbers (the hourly wages of each programmer)
and returns the difference between the highest-paid programmer and the lowest-paid.

Examples
programmers(147, 33, 526) ➞ 493
programmers(33, 72, 74) ➞ 41
programmers(1, 5, 9) ➞ 8

 */

import java.util.Arrays;

public class Task64 {
    public static void main(String[] args) {
        System.out.println(programmers(147, 33, 526));
        System.out.println(programmers(33, 72, 74));
        System.out.println(programmers(1, 5, 9));

    }

    public static int programmers(int wageOne, int wageTwo, int wageThree){
        int difference = 0;

        int[] wages = new int[]{wageOne, wageTwo, wageThree};
        Arrays.sort(wages);

        difference = wages[wages.length-1] - wages[0];

        return difference;
    }
}
