package tasksFromDoc;

/*
6. Maximum Edge of a Triangle
Create a function that finds the maximum range of a triangle's third edge, where the side lengths are all integers.
Notes: (side1 + side2) - 1 = maximum range of third edge.


Examples
nextEdge(8, 10) ➞ 17
nextEdge(5, 7) ➞ 11
nextEdge(9, 2) ➞ 10
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println(maxEdge(9,2));

    }

    public static int maxEdge (int a, int b){
        int c = a+b-1;

        return c;
    }
}
