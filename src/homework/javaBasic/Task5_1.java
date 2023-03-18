package homework.javaBasic;

public class Task5_1 {
    public static void main(String[] args) {

        sumOfAllNumbers();

    }

    public static void sumOfAllNumbers() {
        int i = 0;
        int sum = 0;
        while (i <= 50) {
            sum += i;
            i++;
        }
        System.out.println("TOTAL SUM = " + sum);
    }
}
