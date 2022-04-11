import java.util.Scanner;

public class MovieRating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countMovie = Integer.parseInt(scanner.nextLine());

        double maxRating = 0;
        double minRating = 0;
        minRating = Integer.MAX_VALUE;
        double sumRating = 0;
        String highestRating = "";
        String lowestRaiting = "";
        for (int counter = 1; counter <= countMovie; counter++) {
            String nameMovie = scanner.nextLine();
            double ratingMovie = Double.parseDouble(scanner.nextLine());
        if(ratingMovie > maxRating){
            maxRating = ratingMovie;
            highestRating = nameMovie;
        }
        if (ratingMovie < minRating){
            minRating = ratingMovie;
            lowestRaiting = nameMovie;
        }
        sumRating+= ratingMovie;
        }
        double averageRaiting = sumRating / countMovie;
        System.out.println(String.format("%s is with highest rating: %.1f", highestRating, maxRating));
        System.out.println(String.format("%s is with lowest rating: %.1f", lowestRaiting, minRating));
        System.out.println(String.format("Average rating: %.1f", averageRaiting));
    }
}