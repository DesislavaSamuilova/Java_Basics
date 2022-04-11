import java.util.Scanner;

public class ToyShop_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceVacation = Double.parseDouble(scanner.nextLine());
        int countPuzzle = Integer.parseInt(scanner.nextLine());
        int countDolls = Integer.parseInt(scanner.nextLine());
        int countBears = Integer.parseInt(scanner.nextLine());
        int countMinions = Integer.parseInt(scanner.nextLine());
        int countTruck = Integer.parseInt(scanner.nextLine());

        double pricePuzzle = countPuzzle * 2.60;
        double priceDolls = countDolls * 3.0;
        double priceBears = countBears * 4.10;
        double priceMinions = countMinions * 8.20;
        double priceTruck = countTruck * 2.0;

        double allSum = pricePuzzle + priceDolls + priceBears + priceMinions + priceTruck;
        double countToys = countPuzzle + countDolls + countBears + countMinions + countTruck;

        double discount = allSum * 0.25;
        double finishSum = allSum - discount;
        double rent = 0.10 * finishSum;
        double profit = finishSum - rent;
        double moneyLeft = profit - priceVacation;

        double allSum1 = allSum - (allSum * 0.9);

        if (countToys >= 50) {
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        } else if (profit < priceVacation) {
            double sum = allSum - allSum1;
            double notEnoughMoney = priceVacation - sum;

            if (profit < priceVacation) {
                System.out.printf("Not enough money! %.2f lv needed.", notEnoughMoney);
            }

        }
    }
}
