package tasksFromDoc;
/*
47.9 Remove The Letters ABC
Write a function that takes an array of numbers and returns the second largest number.

Examples
secondLargest([10, 40, 30, 20, 50]) ➞ 40
secondLargest([25, 143, 89, 13, 105]) ➞ 105
secondLargest([54, 23, 11, 17, 10]) ➞ 23
 */

import java.util.Arrays;

public class Task47_9 {

    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{10, 40, 30, 20, 50}));
        System.out.println(secondLargest(new int[]{25, 143, 89, 13, 105}));
        System.out.println(secondLargest(new int[]{54, 23, 11, 17, 10}));

        ////// за допомогою for
        System.out.println(secondLargestFor(new int[]{10, 40, 30, 20, 50}));
        System.out.println(secondLargestFor(new int[]{25, 143, 89, 13, 105}));
        System.out.println(secondLargestFor(new int[]{54, 23, 11, 17, 10}));

    }

    public static int secondLargest(int[] ints) {
        int secondLargestNumber = 0;

        Arrays.sort(ints);
        secondLargestNumber = ints[ints.length-2];

        return secondLargestNumber;
    }

    public static int secondLargestFor(int[] ints) {
        int secondLargestNumber = 0;
        for (int i = 0; i < ints.length-1; i++) {
//            System.out.println(Arrays.toString(ints));
            for (int j = ints.length-1; j >ints.length-3; j--) {
                    if(ints[i] > ints[j]){
                        int temp = ints[i];
                        ints[i] = ints[j];
                        ints[j] = temp;
                    }
                }
//            System.out.println("ints = "+Arrays.toString(ints));
            }
        secondLargestNumber = ints[ints.length-2];
        return secondLargestNumber;
    }

}
