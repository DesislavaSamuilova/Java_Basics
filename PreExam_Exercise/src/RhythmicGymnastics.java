import java.util.Scanner;

public class RhythmicGymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        String device = scanner.nextLine();
        double difficulty = 0;
        double performance = 0;
        double grade = 0;
        if (country.equals("Russia")) {
            if (device.equals("ribbon")) {
                difficulty = 9.100;
                performance = 9.400;
            }
            if (device.equals("hoop")) {
                difficulty = 9.300;
                performance = 9.800;
            }
            if (device.equals("rope")) {
                difficulty = 9.600;
                performance = 9.000;

            }
        } else if (country.equals("Bulgaria")) {
            if (device.equals("ribbon")) {
                difficulty = 9.600;
                performance = 9.400;
            }
            if (device.equals("hoop")) {
                difficulty = 9.550;
                performance = 9.750;
            }
            if (device.equals("rope")) {
                difficulty = 9.500;
                performance = 9.400;
            }
        } else if (country.equals("Italy")) {
            if (device.equals("ribbon")) {
                difficulty = 9.200;
                performance = 9.500;
            }
            if (device.equals("hoop")) {
                difficulty = 9.450;
                performance = 9.350;
            }
            if (device.equals("rope")) {
                difficulty = 9.700;
                performance = 9.150;

            }
        }
        grade = difficulty + performance;
        double leftGrade = 20 - grade;
        double sumGrade = (leftGrade / 20) * 100;
        System.out.printf("The team of %s get %.3f on %s.%n", country, grade, device);
        System.out.printf("%.2f%%", sumGrade);
    }
}