import java.util.Scanner;

public class MultiplicationTable_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int firstNumber = 1; firstNumber <= 10; firstNumber++) {
            for (int secondNumber = 1; secondNumber <= 10; secondNumber++) {
                int result = firstNumber * secondNumber;
                System.out.printf("%d * %d = %d%n", firstNumber, secondNumber, result);
            }
        }
    }
}