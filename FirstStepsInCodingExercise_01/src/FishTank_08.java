import java.util.Scanner;

public class FishTank_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int capacityAquarium = length * width * high;
        double allLiters = capacityAquarium * 0.001;
        double sumPercent = percent * 0.01;
        double needLiters = allLiters * (1 - sumPercent);
        System.out.printf("%.2f", needLiters);
    }
}
