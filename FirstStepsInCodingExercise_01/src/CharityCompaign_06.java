import java.util.Scanner;

public class CharityCompaign_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDays = Integer.parseInt(scanner.nextLine());
        int countConfectioner = Integer.parseInt(scanner.nextLine());
        int countCakes = Integer.parseInt(scanner.nextLine());
        int countWaffles = Integer.parseInt(scanner.nextLine());
        int countPancakes = Integer.parseInt(scanner.nextLine());

        int cakes = countCakes * 45;
        double waffles = countWaffles * 5.80;
        double pancakes = countPancakes * 3.20;
        double sumOfDay = (cakes + waffles + pancakes) * countConfectioner;
        double allSum = sumOfDay * countDays;
        double expense = allSum - allSum/8;

        System.out.printf("%.2f",expense );

    }
}
