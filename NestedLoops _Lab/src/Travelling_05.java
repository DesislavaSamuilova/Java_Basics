import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double needMoney = Double.parseDouble(scanner.nextLine());
            double totalMoney = 0;

            while (totalMoney < needMoney) {
                double savedMoney = Double.parseDouble(scanner.nextLine());
                totalMoney += savedMoney;
            }
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }

    }

}









