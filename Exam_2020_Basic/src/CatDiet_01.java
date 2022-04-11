import java.util.Scanner;

public class CatDiet_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double percentFat = Double.parseDouble(scanner.nextLine());
        double percentProtein = Double.parseDouble(scanner.nextLine());
        double percentCarbohydrates = Double.parseDouble(scanner.nextLine());
        int allCalories = Integer.parseInt(scanner.nextLine());
        int percentWater = Integer.parseInt(scanner.nextLine());
        int oneGramFat = 9;
        int oneGramProtein = 4;
        int oneGramCarbohydrates = 4;

        double allGramFat = ((percentFat / 100) * allCalories) / oneGramFat;
        double allGramProtein = ((percentProtein / 100) * allCalories) / oneGramProtein;
        double allGramCarbohydrates = ((percentCarbohydrates / 100) * allCalories) / oneGramCarbohydrates;
        double gramsOfFood = allGramFat + allGramProtein + allGramCarbohydrates;
        double caloriesForOneGramFood = allCalories / gramsOfFood;
        double leftPercent = 1 - ((percentWater * 1.0) / 100);
        double leftCaloriesInOneGram = leftPercent * caloriesForOneGramFood;
        System.out.printf("%.4f", leftCaloriesInOneGram);
    }
}
