import java.util.Scanner;

public class FootballKit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceShirt = Double.parseDouble(scanner.nextLine());
        double sumToWinBall = Double.parseDouble(scanner.nextLine());

        double priceShorts = 0.75 * priceShirt;
        double priceSocks = 0.20 * priceShorts;
        double priceShoes = (priceShirt + priceShorts) * 2;
        double allSum = priceShirt + priceShorts + priceSocks + priceShoes;
        double sumWithDiscount = allSum - (allSum * 0.15);
        if (sumWithDiscount >= sumToWinBall) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", sumWithDiscount);
        } else if (sumWithDiscount < sumToWinBall) {
            double needMoney = sumToWinBall - sumWithDiscount;
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", needMoney);
        }
    }
}
