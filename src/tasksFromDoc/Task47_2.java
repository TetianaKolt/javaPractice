package tasksFromDoc;

/*
47.2 How Many Decimal Places?
Create a function that returns the number of decimal places a number (given as a string) has.
Any zeros after the decimal point count towards the number of decimal places.
Examples
getDecimalPlaces("43.20") ➞ 2
getDecimalPlaces("400") ➞ 0
getDecimalPlaces("3.1") ➞ 1

Notes
Return 0 if the number doesn't have any decimal places (see example #2).

 */

public class Task47_2 {

    public static void main(String[] args) {

        System.out.println(getDecimalPlaces("43.20"));
        System.out.println(getDecimalPlaces("400"));
        System.out.println(getDecimalPlaces("3.1"));


    }

    public static int getDecimalPlaces(String myNumber) {

        for (int i = 0; i < myNumber.length(); i++) {
            if (myNumber.charAt(i) == '.') {
               return myNumber.substring(i).length()-1;
            }
        }
        return 0;
    }
}
