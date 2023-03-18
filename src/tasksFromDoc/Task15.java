package tasksFromDoc;

/*
15. Football Points
Create a function that takes the number of wins, draws and losses and calculates
the number of points a football team has obtained so far.
wins get 3 points
draws get 1 point
losses get 0 points

Examples
footballPoints(3, 4, 2) ➞ 13
footballPoints(5, 0, 2) ➞ 15
footballPoints(0, 0, 1) ➞ 0

 */

public class Task15 {

    public static void main(String[] args) {
        System.out.println(footballPointsTotal(3,4,2));

    }

    public static int footballPointsTotal(int wins, int draws, int losses) {
        int footballPoints = (wins*3)+(draws*1)+(losses*0);
        return footballPoints;
    }

}

