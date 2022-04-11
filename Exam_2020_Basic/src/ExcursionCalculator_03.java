import java.util.Scanner;

public class ExcursionCalculator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double priceSmall = 0;
        double priceBig = 0;
        double sum = 0;
        double allPrice = 0;

        if (season.equals("spring")) {
            if (countPeople <= 5) {
                priceSmall = 50.00;
                allPrice = priceSmall;
            } else if (countPeople > 5) {
                priceBig = 48.00;
                allPrice = priceBig;
            }
        } else if (season.equals("summer")) {
            if (countPeople <= 5) {
                priceSmall = 48.50;
                allPrice = priceSmall;
            } else if (countPeople > 5) {
                priceBig = 45.00;
                allPrice = priceBig;
            }
        } else if (season.equals("autumn")) {
            if (countPeople <= 5) {
                priceSmall = 60.00;
                allPrice = priceSmall;
            } else if (countPeople > 5) {
                priceBig = 49.50;
                allPrice = priceBig;
            }
        } else if (season.equals("winter")) {
            if (countPeople <= 5) {
                priceSmall = 86.00;
                allPrice = priceSmall;
            } else if (countPeople > 5) {
                priceBig = 85.00;
                allPrice = priceBig;
            }

        }
        sum = countPeople * allPrice;
        if (season.equals("summer")) {
            double sumDiscount = sum - (sum * 0.15);
            System.out.printf("%.2f leva.", sumDiscount);
        } else if (season.equals("winter")) {
            double sumPlus = sum + (sum * 0.08);
            System.out.printf("%.2f leva.", sumPlus);
        } else {
            System.out.printf("%.2f leva.", sum);
        }
    }
}