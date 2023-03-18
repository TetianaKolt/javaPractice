package tasksFromDoc;
/*
47.6 Spaces Between Each Character
Create a function that takes a string and returns a string with spaces in between all of the characters.

Examples
spaceMeOut("space") ➞ "s p a c e"
spaceMeOut("far out") ➞ "f a r   o u t"
spaceMeOut("elongated musk") ➞ "e l o n g a t e d   m u s k"

 */

public class Task47_6 {
    public static void main(String[] args) {
        System.out.println(spaceMeOut("space"));
        System.out.println(spaceMeOut("far out"));
        System.out.println(spaceMeOut("elongated musk"));

    }

    public static String spaceMeOut(String phrase) {

        return phrase.replace("", " ").trim();
    }
}
