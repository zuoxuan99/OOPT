
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of quiz scores to process: ");
        int nQuiz = scan.nextInt();
        int[] scores = new int[nQuiz];

        for (int x = 0; x < scores.length; x++) {
            System.out.printf("Score %d:\n", x + 1);
            scores[x] = scan.nextInt();
        }

        double average = average(scores);
        int aboveAverage = aboveAverage(scores, average);
        System.out.println("Results");
        System.out.println("=======");
        System.out.printf("Average is %.1f\n", average);
        System.out.println("Number of scores above or equal to the average: " + aboveAverage);
        System.out.printf("Number of scores below the average: %d\n", scores.length - aboveAverage);
    }

    public static double average(int scores[]) {
        double total = 0;
        for (int x = 0; x < scores.length; x++) {
            total += scores[x];
        }

        return (total / scores.length);
    }

    public static int aboveAverage(int scores[], double average) {
        int count = 0;
        for (int x = 0; x < scores.length; x++) {
            if (scores[x] > average) {
                count++;
            }
        }
        return count;
    }
}
