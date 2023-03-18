package tasksFromDoc;

/*
14. The Farm Problem
In this challenge, a farmer is asking you to tell him how many legs can be counted among all his animals.
The farmer breeds three species:
chickens = 2 legs
cows = 4 legs
pigs = 4 legs
The farmer has counted his animals and he gives you a subtotal for each species.
You have to implement a function that returns the total number of legs of all the animals.

Notes: The order of animals passed is animals(chickens, cows, pigs)

Examples
animals(2, 3, 5) ➞ 36
animals(1, 2, 3) ➞ 22
animals(5, 2, 8) ➞ 50
 */

public class Task14 {
    public static void main(String[] args) {

        System.out.println(totalLegs(1,2,3));
    }

    public static int totalLegs(int a, int b, int c) {
        int chicken = a*2;
        int cow = b*4;
        int pig = c*4;
        // int totalLegs = chicken+cow+pig;

        // return totalLegs;
        return chicken+cow+pig;
    }
}


