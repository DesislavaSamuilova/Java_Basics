import java.util.Scanner;

public class EqualSumsEvenOddPosition_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        for (int number = startNumber; number <= endNumber; number++) {

            int units = number % 10;
            int tens = number / 10 % 10;
            int hundreds = number / 100 % 10;
            int thousands = number / 1000 % 10;
            int desHil = number / 10000 % 10;
            int stoHil = number / 100000 % 10;
            int sumEven = units + hundreds + desHil;
            int sumOdd = tens + thousands + stoHil;
            if (sumEven == sumOdd) {
                System.out.print(number + " ");
            }
        }
    }
}
