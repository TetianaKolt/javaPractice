package homework.javaBasic;

public class Task4_2 {
    public static void main(String[] args) {
        printHelloFrom();
    }

    public static void printHelloFrom() {
        for (int i = 0; i <= 30; i++) {
            System.out.println("i = " + i);
            if (i == 15) {
                continue;
            }
            if (i >= 25) {
                System.out.println("Hola from Spain!");
            } else if (i % 2 == 1) {
                System.out.println("Hello from England!");
            } else {
                System.out.println("Привіт з України!");
            }
        }
    }
}
