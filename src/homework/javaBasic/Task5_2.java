package homework.javaBasic;

public class Task5_2 {
    public static void main(String[] args) {
        sumOfAllNumbers();
    }

    public static void sumOfAllNumbers() {
        int sum = 0;
        for (int i = 0; i <= 50; i++) {
            System.out.println("i = " + i);
            sum += i;
        }
        System.out.println("TOTAL SUM = " + sum);
    }
}
