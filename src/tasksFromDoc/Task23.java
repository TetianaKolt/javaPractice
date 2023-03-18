package tasksFromDoc;

/*
23. Concatenate First and Last Name into One String
Given two strings, firstName and lastName, return a single string in the format "last, first".

Examples
concatName("First", "Last") ➞ "Last, First"
concatName("John", "Doe") ➞ "Doe, John"
concatName("Mary", "Jane") ➞ "Jane, Mary"
 */

public class Task23 {
    public static void main(String[] args) {

        System.out.println(concatName("First", "Last"));
        System.out.println(concatName("John", "Doe"));
        System.out.println(concatName("Mary", "Jane"));
    }
    public static String concatName(String firstName, String lastName) {

        return lastName.concat(", "  + firstName);
    }
}

