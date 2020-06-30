//5.i & 5.ii - start

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //5.i - end
        //showOddNum between min and max and sum all oddNum
        int minNum;
        int maxNum;
        int minOrMax;
        int sumOdd = 0;

        do {
            System.out.println("Please enter the first Number: ");
            minNum = scan.nextInt();
        } while (minNum < 0);
        do {
            System.out.println("Please enter the second Number: ");
            minOrMax = scan.nextInt();
        } while (minOrMax < 0);

        if (minNum > minOrMax) {
            maxNum = minNum;
            minNum = minOrMax;
        } else {
            maxNum = minOrMax;
        }
        sumOdd = showOddNumber(minNum, maxNum, sumOdd);
        System.out.println("\nSum of all the Odd number between " + minNum + " and " + maxNum + " are " + sumOdd + ".");

    }

    public static int showOddNumber(int minNum, int maxNum, int sumOdd) {
        minNum += 1;
        do {
            if (minNum % 2 == 1) {
                System.out.print(minNum + "+");
                sumOdd += minNum;
                minNum += 1;
            } else if (minNum % 2 == 0) {
                minNum += 1;
            }
        } while (minNum < maxNum);
        System.out.println("=" + sumOdd);
        return sumOdd;
    }
}
//5.ii - end
