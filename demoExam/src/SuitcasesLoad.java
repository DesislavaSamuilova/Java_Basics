import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double capacity = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double leftVolume = 0;
     double count = 0;

        while (!command.equals("End")) {
            System.out.printf("Congratulations! All suitcases are loaded!");
            double volume = Double.parseDouble(command);
            double nowVolume = capacity - volume;
            nowVolume -= leftVolume;
            count++;
            if (count % 3 == 0 ) {
                volume = volume + (volume * 0.1);
            }

            command = scanner.nextLine();
        }

        System.out.printf("No more space!%n");

        System.out.printf("Statistic: %d suitcases loaded.", count);
    }
}
