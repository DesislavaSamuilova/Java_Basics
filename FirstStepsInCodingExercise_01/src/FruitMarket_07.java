import java.util.Scanner;

public class FruitMarket_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceStrawberry = Double.parseDouble(scanner.nextLine());
        double countBanana = Double.parseDouble(scanner.nextLine());
        double countOrange = Double.parseDouble(scanner.nextLine());
        double countRaspberry = Double.parseDouble(scanner.nextLine());
        double countStrawberry = Double.parseDouble(scanner.nextLine());
        double priceRaspberry = priceStrawberry / 2;
        double priceOrange = priceRaspberry - (priceRaspberry* 0.40);
        double priceBanana = priceRaspberry - (priceRaspberry * 0.80);
        double sumRaspberry = countRaspberry * priceRaspberry;
        double sumOrange = countOrange * priceOrange;
        double sumBanana = countBanana * priceBanana;
        double sumStrawberry = countStrawberry * priceStrawberry;
        double allSum = sumRaspberry + sumOrange + sumBanana + sumStrawberry;
        System.out.printf("%.2f", allSum);

    }
}
