import java.util.Scanner;

public class NumberInRange_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        if  (number >= -100 && number <= 100 && number != 0)
        {
            System.out.printf("Yes");}
         else {
            System.out.printf("No");
        }
    }
}


