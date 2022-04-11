import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameMovie = scanner.nextLine();
        int episodeMinutes = Integer.parseInt(scanner.nextLine());
        int breakMinutes = Integer.parseInt(scanner.nextLine());
        double timeForLunch = breakMinutes * 0.125;
        double timeForBreak = breakMinutes * 0.25;
        double leftTime = breakMinutes - timeForLunch - timeForBreak;

        if (leftTime >= episodeMinutes) {
            double leftMinutes = leftTime - episodeMinutes;
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameMovie, leftMinutes);
        } else if (leftTime < episodeMinutes) {
            double needTime = episodeMinutes - leftTime;
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", nameMovie, Math.ceil(needTime));
        }
    }

}
