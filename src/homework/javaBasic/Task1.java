package homework.javaBasic;

public class Task1 {

    public static void main(String[] args) {

        conditionAandB(33, 11);
        conditionAandB(15, 15);
        conditionAandB(40, 20);
        conditionAandB(40, 10);
        conditionAandB(11, 30);
        conditionAandB(5, 30);
        conditionAandB(100, 50);

    }

    public static void conditionAandB(int a, int b) {
        int aTimesB = a * b;
        int aRemB = a % b;
        int aDivByB = a / b;
        int bSubFromA = a - b;
/// variant 1:
        if (aTimesB < 1000 && aRemB == 0) {
            System.out.println("Batman");
        } else if (aDivByB > 1 || bSubFromA == 2) {
            System.out.println("Robin");
        } else {
            System.out.println("nothing");
        }
    }
/// variant 2:
//    if (aTimesB < 1000 && aRemB == 0) {
//        System.out.println("Batman");
//    }
//    if (aDivByB > 1 || bSubFromA == 2) {
//        System.out.println("Robin");
//    }
// }
//
}

