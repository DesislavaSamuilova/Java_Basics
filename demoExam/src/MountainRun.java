import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSecondsPerOneMeter = Double.parseDouble(scanner.nextLine());
        double timeInSeconds = distanceInMeters * timeInSecondsPerOneMeter;
        double addTime = Math.floor(distanceInMeters / 50) * 30;
        double allTime = timeInSeconds + addTime;
        if(recordInSeconds <= allTime){
            double needTime = allTime - recordInSeconds;
            System.out.printf("No! He was %.2f seconds slower.", needTime);
        }else {
            System.out.printf("Yes! The new record is %.2f seconds.", allTime);
        }
    }
}
