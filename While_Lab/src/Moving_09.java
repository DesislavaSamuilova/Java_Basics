import java.util.Scanner;

public class Moving_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int avaibleSpace = width * length * height;
        int occupiedSpace = 0;
        boolean isOccupied = false;
        while (!input.equals("Done")) {
            int space = Integer.parseInt(input);
            occupiedSpace += space;

            if (occupiedSpace > avaibleSpace) {
                int needSpace = Math.abs(avaibleSpace - occupiedSpace);
                System.out.printf("No more free space! You need %d Cubic meters more.", needSpace);
                isOccupied = true;
                break;
            }
            input = scanner.nextLine();
        }

        if (!isOccupied) {
            int leftSpace = avaibleSpace - occupiedSpace;
            System.out.printf("%d Cubic meters left.", leftSpace);
        }
    }
}