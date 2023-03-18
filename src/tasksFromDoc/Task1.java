package tasksFromDoc;

public class Task1 {
    private static int a;
    private static int b;

    public static void main(String[] args) {

        System.out.println(sumAB(-3, -6));

    }

    public static int sumAB(int a, int b) {
        Task1.a = a;
        Task1.b = b;
        int sum = a + b;
        return sum;
    }
}
