package tasksFromDoc;
/*
20. I'd Like A New Shade Of Blue, Please
I have a bucket containing an amount of navy blue paint and I'd like to paint as many walls as possible.
Create a function that returns the number of complete walls that I can paint,
before I need to head to the shops to buy more.

n is the number of square meters I can paint.
w and h are the widths and heights of a single wall in meters.

Examples
howManyWalls(54, 1, 43) ➞ 1
howManyWalls(46, 5, 4) ➞ 2
howManyWalls(100, 4, 5) ➞ 5
howManyWalls(10, 15, 12) ➞ 0
howManyWalls(41, 3, 6) ➞ 2
 */

public class Task20 {

    public static void main(String[] args) {
        System.out.println(howManyWalls(54, 1, 43));
        System.out.println(howManyWalls(46, 5, 4));
        System.out.println(howManyWalls(100, 4, 5));
        System.out.println(howManyWalls(10, 15, 12));
        System.out.println(howManyWalls(41, 3, 6));
    }

    public static int howManyWalls(int n, int w, int h) {
        int area = w * h;
        int quantityOfWalls = 0;

        if (n < area) {
            return 0;
        } else {
            quantityOfWalls = n / area;
        }

        return quantityOfWalls;
    }
}

