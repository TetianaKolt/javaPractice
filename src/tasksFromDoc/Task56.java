package tasksFromDoc;
/*
56 Say "Hello" Say "Bye"
Write a function that takes a string name and a number num (either 0 or 1)
and return "Hello" + name if num is 1, otherwise return "Bye" + name.

Examples
sayHelloBye("alon", 1) ➞ "Hello Alon"
sayHelloBye("Tomi", 0) ➞ "Bye Tomi"
sayHelloBye("jose", 0) ➞ "Bye Jose"

Notes
The name you return must be capitalized.

 */

public class Task56 {
    public static void main(String[] args) {
        System.out.println(sayHelloBye("alon", 1));
        System.out.println(sayHelloBye("Tomi", 0));
        System.out.println(sayHelloBye("jose", 0));
        System.out.println(sayHelloBye("rOSE", 0));

    }

    public static String sayHelloBye(String name, int num) {

        String nameWithBigLetter = name.toLowerCase().substring(0,1).toUpperCase().concat(name.substring(1, name.length()).toLowerCase());

        if(num == 1){
            return "Hello " + nameWithBigLetter;
        } else if (num == 0) {
            return "Bye " + nameWithBigLetter;
        }
        return nameWithBigLetter;
    }
}