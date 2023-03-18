package tasksFromDoc;
/*
47.5 Vowel Replacer

Create a function that replaces all the vowels in a string with a specified character.

Examples
replaceVowels("the aardvark", '#') ➞ "th# ##rdv#rk"
replaceVowels("minnie mouse", '?') ➞ "m?nn?? m??s?"
replaceVowels("shakespeare", '*') ➞ "sh*k*sp**r*"

 */
public class Task47_5 {
    public static void main(String[] args) {

        System.out.println(replaceVowels("the aardvark", '#'));
        System.out.println("ER: ➞ \"th# ##rdv#rk\" ");
        System.out.println(replaceVowels("minnie mouse", '?'));
        System.out.println("ER: ➞ \"m?nn?? m??s?\" ");
        System.out.println(replaceVowels("shakespeare", '*'));
        System.out.println("ER: ➞ \"sh*k*sp**r*\"");

    }

    public static String replaceVowels(String phrase, char replaceVowelWith){
        String newPhrase = phrase;
        String vowels = "AaEeIiOoUu";

        for (char letter:phrase.toCharArray()) {
            for (char vowel:vowels.toCharArray()) {
                if(letter == vowel){
                    newPhrase = newPhrase.replace(letter,replaceVowelWith);
//                    System.out.println("newPhrase = " + newPhrase);
                }
            }
        }

        return newPhrase;
    }
}
