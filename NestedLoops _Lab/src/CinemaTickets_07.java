import java.util.Scanner;

public class CinemaTickets_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nameMovie = scanner.nextLine();

        int counterTotalTickets = 0;
        int counterStudents = 0;
        int counterStandard = 0;
        int counterKids = 0;

        boolean isFinished = false;


        while (!nameMovie.equals("Finish")) {
            if (nameMovie.equals("kid") || nameMovie.equals("standard") || nameMovie.equals("student")) {
                continue;
            }

            int freeSeats = Integer.parseInt(scanner.nextLine());
            String typeTickets = scanner.nextLine();
            int counterTicketsPerMovie = 0;

            while (!typeTickets.equals("End")) {

                if (typeTickets.equals("Finish")) {
                    isFinished = true;
                    break;
                }
                counterTotalTickets++;
                counterTicketsPerMovie++;


                if (typeTickets.equals("student")) {
                    counterStudents++;
                } else if (typeTickets.equals("standard")) {
                    counterStandard++;
                } else if (typeTickets.equals("kid")) {
                    counterKids++;
                }

                if (counterTicketsPerMovie >= freeSeats) {
                    break;
                }

                typeTickets = scanner.nextLine();
            }
            double percentFull = ((counterTicketsPerMovie * 1.0) / freeSeats) * 100;
            System.out.printf("%s - %.2f%% full.%n", nameMovie, percentFull);

            if (isFinished) {
                break;
            }
            nameMovie = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", counterTotalTickets);

        double percentStudents = (counterStudents * 1.0 / counterTotalTickets) * 100;
        double percentStandard = (counterStandard * 1.0 / counterTotalTickets) * 100;
        double percentKids = (counterKids * 1.0 / counterTotalTickets) * 100;

        System.out.printf("%.2f%% student tickets.%n%.2f%% standard tickets.%n%.2f%% kids tickets.", percentStudents, percentStandard, percentKids);

    }
}