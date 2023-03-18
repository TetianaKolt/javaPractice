package tasksFromDoc;

/*
22. Profitable Gamble
Create a function that takes three arguments prob, prize, pay and returns true if prob * prize > pay;
otherwise return false.

Examples
profitableGamble(0.2, 50, 9) ➞ true
profitableGamble(0.9, 1, 2) ➞ false
profitableGamble(0.9, 3, 2) ➞ true

 */

public class Task22 {
    public static void main(String[] args) {
        System.out.println(profitableGamble(0.2, 50, 9));
        System.out.println(profitableGamble(0.9, 1, 2));
        System.out.println(profitableGamble(0.9, 3, 2));
    }

    public static boolean profitableGamble(double prob, int prize, int pay) {

        return (prob * prize > pay);
    }
}


