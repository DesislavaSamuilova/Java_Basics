import java.util.Scanner;

public class SumOfTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startLine = Integer.parseInt(scanner.nextLine());
        int finishLine = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean weFoundIt = false;
        for (int i = startLine; i <= finishLine; i++) {
            for (int j = startLine; j <= finishLine; j++) {
                counter++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", counter, i, j, magicNumber);
                    weFoundIt = true;
                    break;
                }
            }
            if (weFoundIt) {
                break;
            }
        }
            if (!weFoundIt) {
                System.out.printf("%d combinations - neither equals %d%n", counter, magicNumber);
            }
        }
    }


