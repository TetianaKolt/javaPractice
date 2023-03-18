package homework.javaBasic;

public class Task3_1 {
    public static void main(String[] args) {
        priceWithDiscount("A");
        priceWithDiscount("B");
        priceWithDiscount("C");
        priceWithDiscount("D");
        priceWithDiscount("E");
        priceWithDiscount("Gimme a discount!");
    }

    public static void priceWithDiscount(String certificateType) {
        double price = 99.99;
        double priceWithD;
        if (certificateType.equals("A")) {
            priceWithD = price - (price * 0.7);
            System.out.println(priceWithD);
        } else if (certificateType.equals("B")) {
            priceWithD = price - (price * 0.5);
            System.out.println(priceWithD);
        } else if (certificateType.equals("C") || certificateType.equals("D")) {
            priceWithD = price - (price * 0.2);
            System.out.println(priceWithD);
        } else if (certificateType.equals("E")) {
            priceWithD = price - (price * 0.1);
            System.out.println(priceWithD);
        } else {
            priceWithD = price - (price * 0.02);
            System.out.println(priceWithD);
        }

    }
}
