package tasksFromDoc;

/*
8. Basketball Points
You are counting points for a basketball game, given the amount of 2-pointers scored
and 3-pointers scored, find the final points for the team and return that value.

Examples:
points(13, 12) ➞ 62
points(17, 12) ➞ 70
points(38, 8) ➞ 100
 */

public class Task8 {
    public static void main(String[] args) {
        System.out.println(baskPoints(17, 12));
    }

    public static int baskPoints(int firstPoint, int secondPoint) {
        int total = firstPoint * 2 + secondPoint * 3;
        return total;
    }
}