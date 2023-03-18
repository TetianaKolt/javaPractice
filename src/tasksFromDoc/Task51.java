package tasksFromDoc;

/*
51. Difference of Max and Min Numbers in Array
Create a function that takes an array and returns the difference between the biggest and smallest numbers.

Examples
differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) ➞ 82
// Smallest number is -50, biggest is 32.

differenceMaxMin([44, 32, 86, 19]) ➞ 67
// Smallest number is 19, biggest is 86.

 */

import java.util.Arrays;

public class Task51 {
    public static void main(String[] args) {

        differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21});
        System.out.println(" ****** ");
        differenceMaxMin(new int[]{44, 32, 86, 19});
    }

    public static void differenceMaxMin(int[] ints) {
        int smallest = 0;
        int biggest = 0;

        Arrays.sort(ints);
        smallest = ints[0];
        biggest = ints[ints.length-1];


        System.out.println("Smallest number is " + smallest);
        System.out.println("Biggest number is " + biggest);

    }
}

