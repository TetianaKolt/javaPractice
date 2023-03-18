package tasksFromDoc;
/*
67. Write a Java program to reverse elements in an array list.

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task67 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>(Arrays.asList("Sam", "Tim", "Adam", "Eve"));

        Collections.sort(students);
        Collections.reverse(students);
        System.out.println("Reversed collection of students:");

        for (String student : students) {
            System.out.println(student);
        }

    }
}
