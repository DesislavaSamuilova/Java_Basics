import java.util.Scanner;

public class Building_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countFloors = Integer.parseInt(scanner.nextLine());
        int countRooms = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int i = countFloors; i > 0; i--) {

            for ( int j = 0; j < countRooms; j++) {
                if (i % countFloors == 0){
                    System.out.printf("L%d%d ", i, j);
                    continue;

                }
                    if (i % 2 == 0){
                        System.out.printf("O%d%d ", i, j);

                    }
                    else{
                System.out.printf("A%d%d ", i, j);}


            }
            System.out.println();

        }
    }
}
