import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        int productCount = 0;
            while (!command.equals("Stop")) {
            String nameProduct = scanner.nextLine();
            double priceProduct = Double.parseDouble(scanner.nextLine());
                productCount++;
        }
    }
}
