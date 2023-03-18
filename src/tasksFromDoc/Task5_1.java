package tasksFromDoc;
/*
5.1 Find the Perimeter of a Rectangle
Create a function that takes length and width and finds the perimeter of a rectangle.
Examples
findPerimeter(6, 7) ➞ 26
findPerimeter(20, 10) ➞ 60
findPerimeter(2, 9) ➞ 22

 */

public class Task5_1 {
    public static void main(String[] args) {
        System.out.println(findPerimeter(6,7));
        System.out.println(findPerimeter(20,10));
        System.out.println(findPerimeter(2,9));
    }
    public static int findPerimeter(int length, int width){
        return 2*(length+width);
    }
}


