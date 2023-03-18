package homework.javaBasic;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Last number in grading system is inclusive: ");
//        System.out.println("must be F");
        gradingSystemLastNumberInclusive(24);
        gradingSystemLastNumberInclusive(11);
//        System.out.println("Must be C");
        gradingSystemLastNumberInclusive(60);
//        System.out.println("must be F");
        gradingSystemLastNumberInclusive(-5);
//        System.out.println("must be B");
        gradingSystemLastNumberInclusive(80);
//        System.out.println("must be A");
        gradingSystemLastNumberInclusive(81);


        System.out.println("Last number in grading system is exclusive: ");
//        System.out.println("must be F");
        gradingSystemLastNumberExclusive(24);
        gradingSystemLastNumberExclusive(11);
//        System.out.println("Must be B");
        gradingSystemLastNumberExclusive(60);
//        System.out.println("must be F");
        gradingSystemLastNumberExclusive(-5);
//        System.out.println("must be A");
        gradingSystemLastNumberExclusive(80);
//        System.out.println("must be A");
        gradingSystemLastNumberExclusive(81);

    }

    public static void gradingSystemLastNumberInclusive(int mark) {
        if (mark <= 25) {
            System.out.println("F");
        } else if (mark <= 45) {
            System.out.println("E");
        } else if (mark <= 50) {
            System.out.println("D");
        } else if (mark <= 60) {
            System.out.println("C");
        } else if (mark <= 80) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }

    public static void gradingSystemLastNumberExclusive(int mark) {
        if (mark < 25) {
            System.out.println("F");
        } else if (mark < 45) {
            System.out.println("E");
        } else if (mark < 50) {
            System.out.println("D");
        } else if (mark < 60) {
            System.out.println("C");
        } else if (mark < 80) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }

}
