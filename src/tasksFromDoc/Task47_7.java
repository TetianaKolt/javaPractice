package tasksFromDoc;
/*
47.7 Hiding the Card Number
Write a function that takes a credit card number and only displays the last four characters.
The rest of the card number must be replaced by ************.
Examples
cardHide("1234123456785678") ➞ "************5678"
cardHide("8754456321113213") ➞ "************3213"
cardHide("35123413355523") ➞ "**********5523"


Examples
Ensure you return a string.
The length of the string must remain the same as the input.
 */

public class Task47_7 {
    public static void main(String[] args) {
        System.out.println(cardHide("1234123456785678"));
        System.out.println(cardHide("8754456321113213"));
        System.out.println(cardHide("35123413355523"));
    }

    public static String cardHide(String cardNumber){
        char replacement = '*';
        String hiddenCardNumber = cardNumber;
        String last4digits = cardNumber.substring(cardNumber.length()-4);

        for (int i = 0; i < cardNumber.length()-3; i++) {
            hiddenCardNumber = hiddenCardNumber.replace(cardNumber.charAt(i), replacement);
        }
        return hiddenCardNumber.concat(last4digits);
    }
}
