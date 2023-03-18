package homework.javaBasic;

public class Task3_2 {

    public static void main(String[] args) {
        priceWithDiscountSw("A");
        priceWithDiscountSw("B");
        priceWithDiscountSw("C");
        priceWithDiscountSw("D");
        priceWithDiscountSw("E");
        priceWithDiscountSw("Gimme a discount!");
    }

    public static void priceWithDiscountSw(String certificateType) {
        double price = 99.99;
        double priceWithD;

        switch (certificateType) {
            case "A":
                priceWithD = price - (price * 0.7);
                System.out.println(priceWithD);
                break;
            case "B":
                priceWithD = price - (price * 0.5);
                System.out.println(priceWithD);
                break;
            case "C":
            case "D":
                priceWithD = price - (price * 0.2);
                System.out.println(priceWithD);
                break;
            case "E":
                priceWithD = price - (price * 0.1);
                System.out.println(priceWithD);
                break;
            default:
                priceWithD = price - (price * 0.02);
                System.out.println(priceWithD);
        }

    }

}
