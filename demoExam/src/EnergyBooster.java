import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFruit = scanner.nextLine();
        String size = scanner.nextLine();
        int countOrder = Integer.parseInt(scanner.nextLine());
        double sizeNumber = 2;
        double fruitPrice = 5;


        if (typeFruit.equals("Watermelon")) {
            if (size.equals("small")) {
                sizeNumber = 2;
                fruitPrice = 56;
            } else if (size.equals("big")) {
                sizeNumber = 5;
                fruitPrice = 28.70;
            }

        } else if (typeFruit.equals("Mango")) {
            if (size.equals("small")) {
                sizeNumber = 2;
                fruitPrice = 36.66;
            } else if (size.equals("big")) {
                sizeNumber = 5;
                fruitPrice = 19.60;
            }

        } else if (typeFruit.equals("Pineapple")) {
            if (size.equals("small")) {
                sizeNumber = 2;
                fruitPrice = 42.10;
            } else if (size.equals("big")) {
                sizeNumber = 5;
                fruitPrice = 24.80;
            }
        } else if (typeFruit.equals("Raspberry")) {
            if (size.equals("small")) {
                sizeNumber = 2;
                fruitPrice = 20;
            } else if (size.equals("big")) {
                sizeNumber = 5;
                fruitPrice = 15.20;
            }
        }
        double nowPrice = sizeNumber * fruitPrice;
        double set = countOrder * nowPrice;

        if (400 <= set && set <= 1000) {
            double discountSmall = 0.15 * set;
            double finalPrice = set - discountSmall;
            System.out.printf("%.2f lv.", finalPrice);
        } else if (set >= 1000) {
            double discountBig = set * 0.50;
            double finalPrice = set - discountBig;
            System.out.printf("%.2f lv.", finalPrice);
        } else {
            System.out.printf("%.2f lv.", set);
        }
    }
}
