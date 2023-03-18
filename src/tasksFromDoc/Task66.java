package tasksFromDoc;
/*
66. Write a Java program to shuffle elements in a array list. Go to the editor

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task66 {
    public static void main(String[] args) {

        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(8,12,22,45,98));
        Collections.shuffle(ints);

        System.out.println("Shuffled list:");
        for (int number:ints) {
            System.out.println(number);
        }

    }
}
