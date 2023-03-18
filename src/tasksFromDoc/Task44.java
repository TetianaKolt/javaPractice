package tasksFromDoc;


/*
44. Valid Zip Code
Zip codes consist of 5 consecutive digits.
Given a string, write a function to determine whether the input is a valid zip code.
A valid zip code is as follows:
Must only contain numbers (no non-digits allowed).
Must not contain any spaces.
Must not be greater than 5 digits in length.

Examples
isValid("59001") ➞ true
isValid("853a7") ➞ false
isValid("732 32") ➞ false
isValid("393939") ➞ false
 */
public class Task44 {
    public static void main(String[] args) {
        System.out.println(isValid("59001"));
        System.out.println(isValid("853a7"));
        System.out.println(isValid("732 32"));
        System.out.println(isValid("393939"));
    }

    public static boolean isValid(String str) {
        if(str.length() > 5){
            return false;
        }

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(!Character.isDigit(chars[i])){
//                System.out.println("Char [i] is "+str.charAt(i));
                return false;
            }


        }
//        for (char c : chars) {
//            if(Character.isDigit(c) && !Character.isLetter(c)){
//                return true;
//            }
//            if(!Character.isDigit(c) && str.contains(" ") && Character.isLetter(c)){
//                return false;
//            }
//        }

        return true;
    }
}

