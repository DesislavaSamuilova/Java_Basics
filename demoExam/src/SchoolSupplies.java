import java.util.Scanner;

public class SchoolSupplies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPacketPen = Integer.parseInt(scanner.nextLine());
        int countPacketMarkers = Integer.parseInt(scanner.nextLine());
        double literCleanPreparation = Double.parseDouble(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());
        double packetPen = 5.80;
        double packetMarkers = 7.20;
        double literPerPreparation = 1.20;
        double sumForPens = countPacketPen * packetPen;
        double sumForMarkers = countPacketMarkers * packetMarkers;
        double sumForPreparation = literCleanPreparation * literPerPreparation;
        double sumForAll = sumForPens + sumForMarkers + sumForPreparation;
        double sumWithDiscount = sumForAll - ((sumForAll * percentDiscount) / 100);
        System.out.printf("%.3f", sumWithDiscount);
    }
}
