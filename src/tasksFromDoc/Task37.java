package tasksFromDoc;

/*
37. Find the Bomb
Write a function that finds the word "bomb" in the given string.
Return "DUCK!" if found, otherwise,"Relax, there's no bomb.".

Examples
bomb("There is a bomb.") ➞ "DUCK!"
bomb("Hey, did you think there is a BOMB?") ➞ "DUCK!"
bomb("This goes boom!!!") ➞ "Relax, there's no bomb."

 */

public class Task37 {
    public static void main(String[] args) {
        System.out.println(bomb("There is a bomb."));
        System.out.println(bomb("Hey, did you think there is a BOMB?"));
        System.out.println(bomb("This goes boom!!!"));
    }

    public static String bomb(String a) {
        String b = "bomb";
        if(a.toLowerCase().contains(b)){
            return "DUCK!";
        }
        return "Relax,there's no bomb";
    }
}

