import java.util.Scanner;

public class CinemaTicket_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayOfWeek = scanner.nextLine();
        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Friday")){
            System.out.printf("12");}
            else if (dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday")){
            System.out.printf("14");
        } else if(dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")){
            System.out.printf("16");
        }
    }
}

