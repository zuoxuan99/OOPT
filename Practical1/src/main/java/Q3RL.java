/**
 * Recursive Loop Challenge
 *
 * @author Xande
 * @request June
 */
import java.util.Scanner;

public class Q3RL {

    public static void main(String[] args) {
        int z = 1;
        int num1 = 0;
        int creditCard = 43589795;       //Question provide: 43589795, Answer: 50
        int total = rl(creditCard, z, num1);

        System.out.println("Answer: " + total);
    }

    public static int rl(int creditCard, int z, int num1) {

        Scanner scan = new Scanner(System.in);

        System.out.println(creditCard);
        if (creditCard > 0) {
            if (z == 1) {
                num1 += creditCard % 10;

            } else if (z == 0) {
                num1 += creditCard % 10 * 2 / 10;
                num1 += creditCard % 10 * 2 % 10;
            }
            creditCard = creditCard / 10;

            if (z == 1) {
                z = 0;
            } else {
                z = 1;
            }
            return rl(creditCard, z, num1);
        } else {
            System.out.println(num1);
            return num1;
        }
    }
}
