package tasksFromDoc;

/*
42. Largest Swap
Write a function that takes a two-digit number and determines if it's the largest of two possible digit swaps.

To illustrate:
largestSwap(27) ➞ false
largestSwap(43) ➞ true
If 27 is our input, we should return false because swapping the digits gives us 72, and 72 > 27.
On the other hand, swapping 43 gives us 34, and 43 > 34.

Examples
largestSwap(14) ➞ false
largestSwap(53) ➞ true
largestSwap(99) ➞ true
 */

import java.util.Arrays;

public class Task42 {
    public static void main(String[] args) {
        System.out.println(largestSwap(27));
        System.out.println(largestSwap(43));

        System.out.println(largestSwap(14));
        System.out.println(largestSwap(53));
        System.out.println(largestSwap(99));
    }

    public static boolean largestSwap(int a) {
        int reminder;
        int reverse = 0;
        int originalA = a;

        reminder = a % 10;
        a = a / 10;
        reverse = reminder * 10 + a;
//        System.out.println("reverse is " + reverse + " a is "+a);

        return originalA >= reverse;
    }
}

