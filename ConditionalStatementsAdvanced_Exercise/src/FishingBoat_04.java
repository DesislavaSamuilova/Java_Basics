import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int countFishers = Integer.parseInt(scanner.nextLine());
        double rent = 0;
        switch (season) {
            case "Spring":
                rent = 3000;
                break;
            case "Summer":
            case "Autumn":
                rent = 4200;
                break;
            case "Winter":
                rent = 2600;
                break;

        }
        if (countFishers <= 6) {
            rent = rent * 0.90;
        } else if (countFishers <= 11) {
            rent = rent * 0.85;
        } else {
            rent = rent * 0.75;
        }
        if (countFishers % 2 == 0 && (!season.equals("Autumn"))) {
            rent = rent * 0.95;
        }
        if (budget >= rent) {
            double leftMoney = budget - rent;
            System.out.printf("Yes! You have %.2f leva left.", leftMoney);
        } else if (budget < rent) {
            double needMoney = rent - budget;
            System.out.printf("Not enough money! You need %.2f leva.", needMoney);
        }
    }


}
