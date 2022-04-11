import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int maxNumber = Integer.MIN_VALUE;
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number > maxNumber) {
                maxNumber = number;
            }
            sum+= number;
        }
        sum-= maxNumber;

        if(sum == maxNumber){
            System.out.println("Yes");
            System.out.printf("Sum = " + maxNumber);
        }else{

            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(sum - maxNumber));
        }
    }
}
