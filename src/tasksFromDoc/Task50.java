package tasksFromDoc;
/*
50. One Button Messaging Device
Imagine a messaging device with only one button.
For the letter A, you press the button one time, for E, you press it five times, for G, it's pressed seven times, etc, etc.

Write a function that takes a string (the message) and returns the total number of times the button is pressed.

Examples
howManyTimes("abde") ➞ 12
howManyTimes("azy") ➞ 52
howManyTimes("qudusayo") ➞ 123

 */

public class Task50 {
    public static void main(String[] args) {
        System.out.println(howManyTimes("abde"));
        System.out.println(howManyTimes("azy"));
        System.out.println(howManyTimes("qudusayo"));
    }

    public static int howManyTimes(String message) {
        int totalPressed = 0;
        char[] charsOfMessage = message.toCharArray();
        char[] chars = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g',
                'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u',
                'v', 'w', 'x', 'y', 'z'};

        for (char c : charsOfMessage) {
            for (int j = 0; j < chars.length; j++) {
                if (c == chars[j]) {
                    totalPressed = totalPressed + j + 1;
                }
            }
        }

        return totalPressed;
    }
}
