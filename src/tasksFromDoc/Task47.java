package tasksFromDoc;

/*
47. Most Left Digit
Write a function that takes a string as an argument and returns the left most digit in the string.

Examples
leftDigit("TrAdE2W1n95!") ➞ 2
leftDigit("V3r1ta$") ➞ 3
leftDigit("U//DertHe1nflu3nC3") ➞ 1
leftDigit("J@v@5cR1PT") ➞ 5
 */

public class Task47 {
    public static void main(String[] args) {
        System.out.println(leftDigit("TrAdE2W1n95!"));
        System.out.println(leftDigit("V3r1ta$"));
        System.out.println(leftDigit("U//DertHe1nflu3nC3"));
        System.out.println(leftDigit("J@v@5cR1PT"));


    }

    public static int leftDigit(String str){
        char[] chars = str.toCharArray();

        for (char c:chars) {
            if (Character.isDigit(c)){
                return Character.getNumericValue(c);
            }
        }
        return 0;
    }
}

