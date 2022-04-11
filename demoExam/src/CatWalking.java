import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutesForWalk = Integer.parseInt(scanner.nextLine());
        int countWalkingPerDay = Integer.parseInt(scanner.nextLine());
        int takeCalories = Integer.parseInt(scanner.nextLine());
        int caloriesPerWalk = 5;
        int allMinutesForWalk = minutesForWalk * countWalkingPerDay;
        int allCaloriesPerDay = allMinutesForWalk * caloriesPerWalk;
        double allCalories = takeCalories * 0.50;
        if (allCaloriesPerDay >= allCalories) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", allCaloriesPerDay);
        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", allCaloriesPerDay);
        }
    }
}
