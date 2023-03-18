package tasksFromDoc;
/*
35.1 Exists a Number Higher?
Write a function that returns true if there exists at least one number that is larger than or equal to n.

Examples
existsHigher([5, 3, 15, 22, 4], 10) ➞ true
existsHigher([1, 2, 3, 4, 5], 8) ➞ false
existsHigher([4, 3, 3, 3, 2, 2, 2], 4) ➞ true
existsHigher([], 5) ➞ false

 */

public class Task35_1 {
    public static void main(String[] args) {
        System.out.println(existsHigher(new int[]{5, 3, 15, 22, 4}, 10));
        System.out.println(existsHigher(new int[]{1, 2, 3, 4, 5}, 8));
        System.out.println(existsHigher(new int[]{4, 3, 3, 3, 2, 2, 2}, 4));
        System.out.println(existsHigher(new int[]{}, 5));

    }

    public static boolean existsHigher(int[] ints, int n) {

        for (int i = 0; i < ints.length - 1; i++) {
            if (ints[i] < n) {
                continue;
            } else {
                return true;
            }
        } return false;
    }
}

