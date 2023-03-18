package tasksFromDoc;
/*
47.8 Repeating Letters N Times
Create a function that repeats each character in a string n times.

Examples
repeat("mice", 5) ➞ "mmmmmiiiiiccccceeeee"
repeat("hello", 3) ➞ "hhheeellllllooo"
repeat("stop", 1) ➞ "stop"

 */

import java.util.Arrays;

public class Task47_8 {
    public static void main(String[] args) {

        System.out.println(repeat("mice", 5));
        System.out.println(repeat("hello", 3));
        System.out.println(repeat("stop", 1));

    }

    public static String repeat(String originalString, int counter) {

        int originalLength = originalString.length();
        char[] multipliedChars = new char[originalLength * counter];
        StringBuilder init = new StringBuilder();

        for (int i = 0; i < originalLength; i++) {
             char tempChar = originalString.charAt(i);
            for (int j = 0; j < counter; j++) {
                init.append(tempChar);
            }
        }
        ////// THIS IS JAVA 11!!!!
//        for (int i = 0; i < originalString.length(); i++) {
//            String s = String.valueOf(originalString.charAt(i));
//            String repeat = s.repeat(counter);
//            init.append(repeat);
//
//        }


        return init.toString();
    }
}
