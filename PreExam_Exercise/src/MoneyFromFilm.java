import java.util.Scanner;

public class MoneyFromFilm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        int countDays = Integer.parseInt(scanner.nextLine());
        int countTickets = Integer.parseInt(scanner.nextLine());
        double priceTicket = Double.parseDouble(scanner.nextLine());
        int percentForMovies = Integer.parseInt(scanner.nextLine());
        double sumPerDay = countTickets * priceTicket;
        double moneyAllPeriod = countDays * sumPerDay;
        double leftPercent = moneyAllPeriod * percentForMovies / 100;
        double arrival = moneyAllPeriod - leftPercent;
        System.out.printf("The profit from movie %s is %.2f lv.", movieName, arrival);
    }

}
