import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int buyFood = Integer.parseInt(scanner.nextLine());
        int buyFoodInGrams = buyFood * 1000;
        int food = 0;
        String command = scanner.nextLine();
        while (!command.equals("Adopted")) {
            int gramsForEat = Integer.parseInt(command);
            food += gramsForEat;
            command = scanner.nextLine();

        }
        if (food <= buyFoodInGrams) {
            int leftFood = buyFoodInGrams - food;
            System.out.printf("Food is enough! Leftovers: %d grams.", leftFood);
        } else {
            int needFood = food - buyFoodInGrams;
            System.out.printf("Food is not enough. You need %d grams more.", needFood);
        }
    }
}

