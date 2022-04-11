    import java.util.Scanner;

    public class BirthdayParty_05 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int hallPrice = Integer.parseInt(scanner.nextLine());

            double animatorPrice = hallPrice / 3.0;
            double cakePrice = hallPrice * 0.2;
            double drinksPrice = cakePrice - 0.45 * cakePrice;

            double needSum = hallPrice + animatorPrice + cakePrice + drinksPrice;
            System.out.println(needSum);
        }
    }
