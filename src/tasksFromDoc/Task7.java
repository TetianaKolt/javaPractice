package tasksFromDoc;

/*
7. Area of a Triangle
Write a function that takes the base and height of a triangle and return its area.
Notes: The area of a triangle is: (base * height) / 2

Examples:
triArea(3, 2) ➞ 3
triArea(7, 4) ➞ 14
triArea(10, 10) ➞ 50
 */

public class Task7 {
    public static void main(String[] args) {

        System.out.println(triangleArea(10, 10));
    }

    public static int triangleArea(int base, int height){
        int area = (base*height)/2;
        return area;
    }
}

