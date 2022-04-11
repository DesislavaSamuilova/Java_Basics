import java.util.Scanner;

public class ANDProcessors_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countProcessors = Integer.parseInt(scanner.nextLine());
        int countEmployees = Integer.parseInt(scanner.nextLine());
        int countDays = Integer.parseInt(scanner.nextLine());

        int allTime = countEmployees * countDays * 8;
        double madeProcessors = Math.floor(allTime / 3);
        if (madeProcessors < countProcessors) {
            double diff = countProcessors - madeProcessors;
            double losses = diff * 110.10;
            System.out.printf("Losses: -> %.2f BGN", losses);
        } else {
            double diff = madeProcessors - countProcessors;
            double profit = diff * 110.10;
            System.out.printf("Profit: -> %.2f BGN", profit);
        }
    }
}
