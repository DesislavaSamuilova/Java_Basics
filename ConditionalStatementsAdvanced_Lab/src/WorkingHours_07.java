import java.util.Scanner;

public class WorkingHours_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourOfDayAndNight = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        if (hourOfDayAndNight >= 10 && hourOfDayAndNight <= 18) {
            switch (dayOfWeek) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                case "Saturday":
                    System.out.printf("open");
                    break;
                case "Sunday":
                default:
                    System.out.printf("closed");
                    break;
            }
        } else {
            System.out.println("closed");
        }

    }
}

