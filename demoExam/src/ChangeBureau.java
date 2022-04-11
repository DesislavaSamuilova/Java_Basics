import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int bitcoin = Integer.parseInt(scanner.nextLine());
                double chinaUana = Double.parseDouble(scanner.nextLine());
                double commisionPercent = Double.parseDouble(scanner.nextLine());
                int bitcoinOne = 1168;
                double chinaUanaOne = 0.15;
                double dollar = 1.76;
                double euro = 1.95;

                int allBitcoin = bitcoin * bitcoinOne;
                double allUana = chinaUana * chinaUanaOne;
                double dollarsInLv = allUana * dollar;
                double allSum = allBitcoin + dollarsInLv;
                double sumInEuro = allSum / 1.95;
                double allCommision = sumInEuro * commisionPercent / 100;
                double result = sumInEuro - allCommision;
        System.out.printf("%.2f", result);
    }
}
