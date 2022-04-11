import java.util.Scanner;

public class Moon_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double middleSpeed = Double.parseDouble(scanner.nextLine());
        double literFuel = Double.parseDouble(scanner.nextLine());
        int allDistance = 384400 * 2;
        int timeToGoAndReturn = (int) Math.ceil(allDistance / middleSpeed);
        int allTime = timeToGoAndReturn + 3;
        int fuel = (int) ((literFuel * allDistance) / 100);
        System.out.println(allTime);
        System.out.println(fuel);
    }
}
