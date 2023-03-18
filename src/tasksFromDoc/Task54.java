package tasksFromDoc;

/*
54. Return the Index of the First Vowel
Create a function that returns the index of the first vowel in a string.

Examples
firstVowel("apple") ➞ 0
firstVowel("hello") ➞ 1
firstVowel("STRAWBERRY") ➞ 3
firstVowel("pInEaPPLe") ➞ 1

 */


public class Task54 {
    public static void main(String[] args) {
        System.out.println(firstVowel("apple"));
        System.out.println(firstVowel("hello"));
        System.out.println(firstVowel("STRAWBERRY"));
        System.out.println(firstVowel("pInEaPPLe"));
    }

    public static int firstVowel(String str) {

        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};
        char[] letters = str.toLowerCase().toCharArray();

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if(letters[i] == vowels[j]){
                    return i;
                }
            }
        }
        return 0;
    }

}

