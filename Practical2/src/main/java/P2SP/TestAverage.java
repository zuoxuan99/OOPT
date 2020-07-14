// Self Practice
package P2SP;

public class TestAverage {

    public static void main(String[] args) {
        int num1 = 2, num2 = 4, num3 = 6;
        double dnum1 = 3, dnum2 = 6, dnum3 = 9;

        System.out.println("Average = " + Average.calculateAverage(num1, num2));
        System.out.println("Average = " + Average.calculateAverage(num1, num2, num3));
        System.out.println("Average = " + Average.calculateAverage(dnum1, dnum2));
        System.out.println("Average = " + Average.calculateAverage(dnum1, dnum2, dnum3));
    }
}
