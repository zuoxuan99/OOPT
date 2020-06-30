
import java.lang.Math;

public class Q1 {

    public static void main(String[] args) {
        int num = 0;

        System.out.println("Number     SquareRoot");
        for (int x = 0; x <= 10; x++) {

            System.out.printf("%-11d%.4f\n", num, Math.sqrt(num));
            num += 2;
        }
    }
}
