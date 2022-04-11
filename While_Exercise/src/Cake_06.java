import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weight = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        int countCake = weight * lenght;
        String input = scanner.nextLine();
        int count = 0;
        boolean isAvaible = false;
        while (!input.equals("STOP")) {
            int current = Integer.parseInt(input);
            count += current;
            if (count > countCake) {
                int needPiece = Math.abs(count - countCake);
                System.out.printf("No more cake left! You need %d pieces more.", needPiece);
                isAvaible = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (!isAvaible){
            int leftPiece = countCake - count;
            System.out.printf("%d pieces are left.", leftPiece);
        }
    }
}
