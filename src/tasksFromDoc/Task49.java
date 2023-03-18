package tasksFromDoc;

/*
49. Nth Smallest Integer
Given an unsorted array, create a function that returns the nth smallest integer
(the smallest integer is the first smallest, the second smallest integer is the second smallest, etc).

Notes: Given an out of bounds parameter (e.g. an array is of size k),
and you are asked to find the m > k smallest integer, return -1.

Examples
nthSmallest([1, 3, 5, 7], 1) ➞ 1
nthSmallest([1, 3, 5, 7], 3) ➞ 5
nthSmallest([1, 3, 5, 7], 5) ➞ -1
nthSmallest([7, 3, 5, 1], 2) ➞ 3

 */

import java.util.Arrays;

public class Task49 {
    public static void main(String[] args) {

        System.out.println(nthSmallest(new int[]{1,3,5,7}, 1));
        System.out.println(nthSmallest(new int[]{1,3,5,7}, 3));
        System.out.println(nthSmallest(new int[]{1,3,5,7}, 5));
        System.out.println(nthSmallest(new int[]{1,3,5,7}, 2));

    }
    public static int nthSmallest(int[] ints, int k) {
        if(k>ints.length){
            return -1;
        }
        Arrays.sort(ints);

        return ints[k-1];
    }
}

