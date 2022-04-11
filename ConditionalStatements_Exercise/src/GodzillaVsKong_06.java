import java.util.Scanner;

public class GodzillaVsKong_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countStatists = Integer.parseInt(scanner.nextLine());
        double pricePerStatist = Double.parseDouble(scanner.nextLine());

        double priceDecor = 0.10 * budget;
        double priceStatists = countStatists * pricePerStatist;

        if(countStatists > 150){
            priceStatists = priceStatists - 0.10 * priceStatists;
        }
            double expenses = priceDecor + priceStatists;

        if(budget >= expenses) {
            System.out.println("Action!");
            double leftMoney = budget - expenses;
            System.out.printf("Wingard starts filming with %.2f leva left.",leftMoney);
        }  else {
            System.out.println("Not enough money!");
            double needMoney = expenses - budget;
            System.out.printf("Wingard needs %.2f leva more.",needMoney);
        }
    }
}
