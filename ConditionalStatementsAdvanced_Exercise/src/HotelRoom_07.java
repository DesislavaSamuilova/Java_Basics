import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int countNights = Integer.parseInt(scanner.nextLine());

        double priceStudio = 0;
        double priceApartment = 0;

        switch (month) {
            case "May":
            case "October":
                priceStudio = 50;
                priceApartment = 65;
                if (countNights > 7 && countNights <= 14) {
                    priceStudio = priceStudio - 0.05 * priceStudio;
                } else if (countNights > 14) {
                    priceStudio = priceStudio - 0.30 * priceStudio;
                }
                break;
            case "June":
            case "September":
                priceStudio = 75.20;
                priceApartment = 68.70;
                if (countNights > 14) {
                    priceStudio = priceStudio * 0.80;
                }
                break;
            case "July":
            case "August":
                priceStudio = 76;
                priceApartment = 77;
                break;
        }


        if (countNights > 14) {
            priceApartment = priceApartment * 0.90;
            
        }

        double finalPriceApart = countNights * priceApartment;

        double finalPriceStudio = countNights * priceStudio;

        System.out.printf("Apartment: %.2f lv.%n", finalPriceApart);
        System.out.printf("Studio: %.2f lv.", finalPriceStudio);


    }
}
