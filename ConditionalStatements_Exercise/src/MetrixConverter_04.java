import java.util.Scanner;

public class MetrixConverter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberForConversion = Double.parseDouble(scanner.nextLine());
        String inputUnit = scanner.nextLine();
        String outputUnit = scanner.nextLine();
        double numberInput = 0;
        double numberOutput = 0;
        double m = 0;
        double mm = 0;
        double cm = 0;

        if (inputUnit.equals("m")) {
            numberInput = numberForConversion / 1;
        } else if (inputUnit.equals("cm")) {
            numberInput= numberForConversion / 100;
        } else if (inputUnit.equals("mm")) {
            numberInput = numberForConversion / 1000;
        }

        if (outputUnit.equals("m")) {
            numberOutput = numberInput * 1;
        } else if (outputUnit.equals("cm")) {
            numberOutput = numberInput * 100;
        } else if (outputUnit.equals("mm")) {
            numberOutput = numberInput * 1000;
        }
    System.out.printf("%.3f",numberOutput);}}




