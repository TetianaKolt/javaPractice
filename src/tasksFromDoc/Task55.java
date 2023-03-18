package tasksFromDoc;
/*
55. Can You Spare A Square?
Try to imagine a world in which you might have to stay home for 14 days at any given time.
Do you have enough TP to make it through?
Although the number of squares per roll of TP varies significantly,
we'll assume each roll has 500 sheets, and the average person uses 57 sheets per day.
Create a function that will accept the following parameters:

people — Number of people in the household.
tp — Number of rolls.
Return a statement telling the user if they need to buy more TP!

Examples
tpChecker(4, 1) ➞ "Your TP will only last 2 days, buy more!"
tpChecker(3, 20) ➞ "Your TP will last 58 days, no need to panic!"
tpChecker(4, 12) ➞ "Your TP will last 26 days, no need to panic!"

 */


public class Task55 {

    public static void main(String[] args) {
        System.out.println(tpChecker(4, 1));
        System.out.println(tpChecker(3, 20));
        System.out.println(tpChecker(4, 12));

    }

    public static String tpChecker(int qnttOfPeopleInHousehold, int qnttOfRolls) {
        int rollSquareQnttInOneRoll = 500;
        int averageUsePerOnePerson = 57;
        int tpSquaresQntt = qnttOfRolls * rollSquareQnttInOneRoll;
        int days = 14;

        int howManyDays = tpSquaresQntt / (qnttOfPeopleInHousehold * averageUsePerOnePerson);

        if (howManyDays < days) {
            return ("Your TP will only last " + howManyDays + " days, buy more!");
        }
        else {
            return ("Your TP will last " + howManyDays + " days, no need to panic!");
        }
    }
}
