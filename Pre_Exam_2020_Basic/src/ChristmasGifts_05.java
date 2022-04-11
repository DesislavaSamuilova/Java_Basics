import java.util.Scanner;

public class ChristmasGifts_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        int counter = 0;
        int priceToy = 5;
        int sweaters = 15;
        int adult = 0;
        int kids = 0;
        int count = 0;
        while (!command.equals("Christmas")) {
            int age = Integer.parseInt(command);
            if (age <= 16) {
                kids++;
                kids += counter;
            } else {
                adult++;
                adult += count;
            }
            command = scanner.nextLine();
        }
            int priceToys = kids * priceToy;
            int priceSweaters = adult * sweaters;

        System.out.printf("Number of adults: %d%n", adult);
        System.out.printf("Number of kids: %d%n", kids);
        System.out.printf("Money for toys: %d%n", priceToys);
        System.out.printf("Money for sweaters: %d", priceSweaters);

    }
}

