package tasksFromDoc;
/*

58. Return the Middle Character(s) of a String
Create a function that takes a string and returns the middle character(s). If the word's length is odd, return the middle character. If the word's length is even, return the middle two characters.

Examples
getMiddle("test") ➞ "es"
getMiddle("testing") ➞ "t"
getMiddle("middle") ➞ "dd"
getMiddle("A") ➞ "A"


 */

public class Task58 {
    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("testing"));
        System.out.println(getMiddle("middle"));
        System.out.println(getMiddle("A"));
    }


    public static String getMiddle(String word) {
        String middle = word;

        if(word.length()%2 == 0){
            middle = word.substring(word.length()/2-1, word.length()/2+1);
        }
        else if(word.length() <= 1){
            return word;
        }
        else if(word.length()%2 ==1){
            middle = word.substring(word.length()/2+1);
        }
        return middle;
    }
}
