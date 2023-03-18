package tasksFromDoc;
import java.util.Arrays;

/*
41. Is the Word an Isogram?
An isogram is a word that has no duplicate letters. Create a function that takes a string
and returns either true or false depending on whether or not it's an "isogram".

Examples
isIsogram("Algorism") ➞ true
isIsogram("Password") ➞ false
isIsogram("Consecutive") ➞ false
 */
public class Task41 {
    public static void main(String[] args) {
        System.out.println(isIsogramA("Algorism"));
        System.out.println(isIsogramA("Password"));
        System.out.println(isIsogramA("Consecutive"));
    }

    public static boolean isIsogram(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.toLowerCase().charAt(i) == s.toLowerCase().charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }
    public static boolean isIsogramA(String s) {

        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if(s.indexOf(s.charAt(i),i+1) !=-1 ){
                return false;
            }
//
//            if(s.substring(i+1).contains(String.valueOf(s.charAt(i)))){
//                return false;
//            }
        }
        return true;
    }
}

