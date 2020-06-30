
import java.lang.Math;

public class Q2 {

    public static void main(String[] args) {
        for (int x = 0;x <= 25; x++) {
            System.out.printf("%-11d%.4f\n", x, Math.sqrt(x));
        }
    }

    public static double sqrt(double num) {

        double u = 0, l = 0;
        double mid, smid;

        if (num == 0 || num == 1) {
            return num;
        } else if (num < 0) {
            System.out.println("Error.....");
            System.exit(-1);
        } else if (num > 1) {
            l = 1;
            u = num;
        } else {
            u = 1;
            l = num;
        }

        while (Math.abs((l - u) / 1) >= 1.0e-8) {

            mid = (u + l) / 2;
            smid = mid * mid;
            
            if (smid > num) {
                u = mid;
            } else {
                l = mid;
            }
        }

        return (u + l) / 2.0;
    }
}
