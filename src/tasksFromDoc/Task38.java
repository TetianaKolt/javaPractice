package tasksFromDoc;
/*
38. How Many Vowels?
Create a function that takes a string and returns the number (count) of vowels contained within it.
a, e, i, o, u are considered vowels (not y).

Examples
countVowels("Celebration") ➞ 5
countVowels("Palm") ➞ 1
countVowels("Prediction") ➞ 4
 */

public class Task38 {
    public static void main(String[] args) {
        System.out.println(countVowels("Celebration"));
        System.out.println(countVowels("Palm"));
        System.out.println(countVowels("Prediction"));
    }

    public static int countVowels(String a) {
        int count = 0;
        char [] vowels = new char[] {'a', 'e', 'i', 'o', 'u'};


        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if(a.toLowerCase().charAt(i) == vowels[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static int countVowelsA(String a){
        int count = 0;
        char [] vowels = new char[] {'a', 'e', 'i', 'o', 'u'};
        char [] chars = a.toLowerCase().toCharArray();


        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if(chars[i] == vowels[j]){
                    count++;
                }
            }
        }
        return count;
    }
}

