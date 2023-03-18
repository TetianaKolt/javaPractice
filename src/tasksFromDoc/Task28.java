package tasksFromDoc;

/*
28. Is the Word Singular or Plural?
Create a function that takes in a word and determines whether or not it is plural.
A plural word is one that ends in "s".

Examples
isPlural("changes") ➞ true
isPlural("change") ➞ false
isPlural("dudes") ➞ true
isPlural("magic") ➞ false
 */

public class Task28 {
    public static void main(String[] args) {
        System.out.println(isPlural("changes"));
        System.out.println(isPlural("change"));
        System.out.println(isPlural("dudes"));
        System.out.println(isPlural("magic"));
    }

    public static boolean isPlural(String a) {

        return a.endsWith("s");
    }

    public static boolean isPluralForm(String a) {

        return a.charAt(a.length()-1) == 's';
    }
}

