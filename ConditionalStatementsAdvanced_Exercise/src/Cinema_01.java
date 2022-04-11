import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int countRows = Integer.parseInt(scanner.nextLine());
        int countColumns = Integer.parseInt(scanner.nextLine());
        double income = 0.0;

        if (projection.equals("Premiere")) {
            income = countRows * countColumns * 12;
        } else if(projection.equals("Normal")){
            income = countRows * countColumns * 7.50;
        } else if (projection.equals("Discount")){
            income = countRows * countColumns * 5.00;
        }
        System.out.printf("%.2f leva", income);
    }
}
