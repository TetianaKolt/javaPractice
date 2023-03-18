package homework.javaBasic;

public class Task4_1 {
    public static void main(String[] args) {
        printHelloFrom();
    }

    public static void printHelloFrom() {
        int i = 0;
        while (i <= 30) {
            System.out.println("i = " + i);
            i++;
            if (i == 15) {
                continue;
            }
            if (i > 25) {
                System.out.println("Hola from Spain!");
            } else if (i % 2 == 1) {
                System.out.println("Hello from England!");
            } else {
                System.out.println("Привіт з України!");
            }
        }
    }
}


