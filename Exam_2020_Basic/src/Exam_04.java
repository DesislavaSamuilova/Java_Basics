import java.util.Scanner;

public class Exam_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countStudent = Integer.parseInt(scanner.nextLine());
        double count = 0;
        double groupOne = 0;
        double groupTwo = 0;
        double groupThree = 0;
        double groupFour = 0;
        double allEvaluation = 0;
        for (int i = 1; i <= countStudent; i++) {
            double evaluationOfExam = Double.parseDouble(scanner.nextLine());
            allEvaluation += evaluationOfExam;
            if (evaluationOfExam >= 5.00) {
                groupOne++;
                groupOne += count;

            } else if (evaluationOfExam >= 4 && evaluationOfExam <= 4.99) {
                groupTwo++;
                groupTwo += count;

            } else if (evaluationOfExam >= 3 && evaluationOfExam <= 3.99) {
                groupThree++;
                groupThree += count;

            } else if (evaluationOfExam < 3) {
                groupFour++;
                groupFour += count;
            }

        }
        double one = (groupOne / countStudent) * 100;
        double two = (groupTwo / countStudent) * 100;
        double three = (groupThree / countStudent) * 100;
        double four = (groupFour / countStudent) * 100;

        double average = allEvaluation / countStudent;
        System.out.printf("Top students: %.2f%%%n", one);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", two);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", three);
        System.out.printf("Fail: %.2f%%%n", four);
        System.out.printf("Average: %.2f", average);

     }
}
