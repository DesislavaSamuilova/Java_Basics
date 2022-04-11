import java.util.Scanner;

public class OperationsBetweenNumbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        switch (operator) {
            case "+":
                int result = number1 + number2;
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %s - even", number1, operator, number2, result);
                } else {
                    System.out.printf("%d %s %d = %s - odd", number1, operator, number2, result);
                }
                break;
            case "-":
                result = number1 - number2;
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", number1, operator, number2, result);
                } else {
                    System.out.printf("%d %s %d = %d - odd", number1, operator, number2, result);
                }
                break;
            case "*":
                result = number1 * number2;
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", number1, operator, number2, result);
                } else {
                    System.out.printf("%d %s %d = %d - odd", number1, operator, number2, result);
                }
                break;
            case "/":
                if (number2 == 0) {
                    System.out.printf("Cannot divide %d by zero", number1);
                } else {
                    double division = number1 * 1.0 / number2;
                    System.out.printf("%d / %d = %.2f", number1, number2, division);
                }
                break;
            case "%":
                if (number2 == 0) {
                    System.out.printf("Cannot divide %d by zero", number1);
                } else {
                    int leftover = number1 % number2;
                    System.out.printf("%d %s %d = %d", number1, operator, number2,leftover);
                }
                break;
        }
    }
}

