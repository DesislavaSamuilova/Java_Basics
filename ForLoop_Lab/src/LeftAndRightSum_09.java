import java.util.Scanner;

public class LeftAndRightSum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rigthSum = 0;
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            leftSum += number;
        }
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            rigthSum += number;
        }
        if (leftSum == rigthSum) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(leftSum - rigthSum));
        }
    }
}