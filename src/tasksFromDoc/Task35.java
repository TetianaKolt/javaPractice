package tasksFromDoc;

/*
35. Reverse the Order of a String
Create a method that takes a string as its argument and returns the string in reversed order.

Examples
reverse("Hello World") ➞ "dlroW olleH"
reverse("The quick brown fox.") ➞ ".xof nworb kciuq ehT"
reverse("Edabit is really helpful!") ➞ "!lufpleh yllaer si tibadE
 */

import java.util.Arrays;
import java.util.Collections;

public class Task35 {
    public static void main(String[] args) {
//        System.out.println(reverse("Hello World"));
//        System.out.println(reverse("The quick brown fox."));
//        System.out.println(reverse("Edabit is really helpful!"));
        System.out.println(reverseOne("Hello World"));
        System.out.println(reverseOne("The quick brown fox."));
        System.out.println(reverseOne("Edabit is really helpful!"));

    }

    public static String reverse(String str) {

        String[] str1 = str.split("");
        System.out.println(Arrays.toString(str1));
        Collections.reverse(Arrays.asList(str1));
        System.out.println(Arrays.toString(str1));

//        return String.valueOf(str1);
        return String.join("", str1);
    }

    public static String reverseOne(String str){
        char[] chars = str.toCharArray();
        int j = chars.length-1;
        for (int i = 0; i <= j; i++) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            j--;
        }
        return String.valueOf(chars);
    }
}

