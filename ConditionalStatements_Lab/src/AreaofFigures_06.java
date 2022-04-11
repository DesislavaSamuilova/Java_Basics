import java.util.Scanner;

public class AreaofFigures_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        double area = 0;
        if (shape.equals("square")){
            double a = Double.parseDouble(scanner.nextLine());
            area = a * a;
            System.out.printf("%.3f", area);
        } if (shape.equals("rectangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a * b;
            System.out.printf("%.3f", area);
        } else if (shape.equals("circle")){
            double radius = Double.parseDouble(scanner.nextLine());
            area = radius * radius * Math.PI;
            System.out.printf("%.3f", area);
        } else if (shape.equals("triangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double hA = Double.parseDouble(scanner.nextLine());
            area = a * hA / 2;
            System.out.printf("%.3f", area);
        }

    }
}
