import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (flowers) {
            case "Roses":
                price = countFlowers * 5.00;
                if (countFlowers > 80) {
                    price = price - 0.10 * price;
                }
                break;
            case "Dahlias":
                price = countFlowers * 3.80;
                if (countFlowers > 90) {
                    price = price - 0.15 * price;
                }
                break;
            case "Tulips":
                price = countFlowers * 2.80;
                if (countFlowers > 80) {
                    price = price - 0.15 * price;
                }
                break;
            case "Narcissus":
                price = countFlowers * 3;
                if (countFlowers < 120) {
                    price = price + price * 0.15;
                }
                break;
            case "Gladiolus":
                price = countFlowers * 2.50;
                if (countFlowers < 80) {
                    price = price + price * 0.20;
                }
                break;
        }
        if (budget >= price) {
            double leftMoney = budget - price;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flowers, leftMoney);
        } else {
            double needMoney = price - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", needMoney);
        }


    }

}
