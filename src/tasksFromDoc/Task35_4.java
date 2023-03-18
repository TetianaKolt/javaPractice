package tasksFromDoc;
/*
35.4 Scoring System

Andy, Ben and Charlotte are playing a board game.
The three of them decided to come up with a new scoring system.
A player's first initial ("A", "B" or "C") denotes that player scoring a single point.
Given a string of capital letters, return an array of the players' scores.
For instance, if ABBACCCCAC is written when the game is over, then Andy scored 3 points,
Ben scored 2 points, and Charlotte scored 5 points,
since there are 3 instances of letter A, 2 instances of letter B, and 5 instances of letter C.
So the array [3, 2, 5] should be returned.
Examples
calculateScores("A") ➞ [1, 0, 0]

calculateScores("ABC") ➞ [1, 1, 1]

calculateScores("ABCBACC") ➞ [2, 2, 3]

Notes
If given an empty string as an input, return [0, 0, 0].

 */

import java.util.Arrays;

public class Task35_4 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(calculateScores("A")));
        System.out.println(Arrays.toString(calculateScores("ABC")));
        System.out.println(Arrays.toString(calculateScores("ABCBACC")));


    }

    public static int[] calculateScores(String letters) {
        int[] score = new int[3];
        int countA = 0;
        int countB = 0;
        int countC = 0;

        char[] chars = letters.toCharArray();

        for (char letter : chars) {
            if (letter == 'A') {
                countA++;
            } else if (letter == 'B') {
                countB++;
            } else {
                countC++;
            }
        }

        score[0] = countA;
        score[1] = countB;
        score[2] = countC;

        return score;

    }

}
