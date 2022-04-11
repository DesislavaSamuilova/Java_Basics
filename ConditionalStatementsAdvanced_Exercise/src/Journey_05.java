import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0;

        if (season.equals("Summer".toLowerCase())) {
            if (budget <= 100) {
                System.out.println("Somewhere in Bulgaria");
                price = budget * 30 / 100;
                System.out.printf("Camp - %.2f", price);
            } else if (budget > 100 && budget <= 1000) {
                System.out.println("Somewhere in Balkans");
                price = budget * 40 / 100;
                System.out.printf("Camp - %.2f", price);
            } else {
                System.out.println("Somewhere in Europe");
                price = budget * 90 / 100;
                System.out.printf("Hotel - %.2f", price);
            }
        }

        if (season.equals("Winter".toLowerCase())) {
            if (budget <= 100) {
                System.out.println("Somewhere in Bulgaria");
                price = budget * 70 / 100;
                System.out.printf("Hotel - %.2f", price);
            } else if (budget > 100 && budget <= 1000) {
                System.out.println("Somewhere in Balkans");
                price = budget * 80 / 100;
                System.out.printf("Hotel - %.2f", price);
            } else {
                System.out.println("Somewhere in Europe");
                price = budget * 90 / 100;
                System.out.printf("Hotel - %.2f", price);
            }
        }
    }
}