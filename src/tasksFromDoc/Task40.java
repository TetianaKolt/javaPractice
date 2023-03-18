package tasksFromDoc;

/*
40. Is the Average of All Elements a Whole Number?
Create a function that takes an array as an argument and returns true or false depending on
whether the average of all elements in the array is a whole number or not.

Examples
isAvgWhole([1, 3]) ➞ true
isAvgWhole([1, 2, 3, 4]) ➞ false
isAvgWhole([1, 5, 6]) ➞ true
isAvgWhole([1, 1, 1]) ➞ true
isAvgWhole([9, 2, 2, 5]) ➞ false
 */

import java.util.Arrays;
import java.util.OptionalDouble;

public class Task40 {
    public static void main(String[] args) {
        System.out.println(isAvgWholeA(new int[]{1,3}));
        System.out.println(isAvgWholeA(new int[]{1,2,3,4}));
        System.out.println(isAvgWholeA(new int[]{1,5,6}));
        System.out.println(isAvgWholeA(new int[]{1,1,1}));
        System.out.println(isAvgWholeA(new int[]{9,2,2,5}));



    }

    public static boolean isAvgWhole(int [] numbers){
        OptionalDouble average = Arrays.stream(numbers).average();
//        System.out.println(average.getAsDouble());
        double d = average.getAsDouble();
        return d % 1 == 0;
    }

    public static boolean isAvgWholeA(int [] numbers) {
        int sum = 0;
        double average;
        for (int i = 0; i < numbers.length; i++) {
            sum +=numbers[i];
        }

        average = (double)sum/numbers.length;
        return average % 1 == 0;
    }
}

