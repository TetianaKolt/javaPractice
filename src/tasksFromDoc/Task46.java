package tasksFromDoc;

/*
46. Maximum Possible Total
Given an array of 10 numbers, return the maximum possible total made by summing just 5 of the 10 numbers.

Examples
maxTotal([1, 1, 0, 1, 3, 10, 10, 10, 10, 1]) ➞ 43
maxTotal([0, 0, 0, 0, 0, 0, 0, 0, 0, 100]) ➞ 100
maxTotal([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) ➞ 40
 */

import java.util.Arrays;

public class Task46 {
    public static void main(String[] args) {
        maxTotal(new int[]{1, 1, 0, 1, 3, 10, 10, 10, 10, 1});
        maxTotal(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 100});
        maxTotal(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    }

    public static void maxTotal(int[] ints) {
        Arrays.sort(ints);
        int count = 0;
        for (int i = 5; i < ints.length; i++) {
            count = ints[i]+count;
        }
        System.out.println(count);
    }
}

