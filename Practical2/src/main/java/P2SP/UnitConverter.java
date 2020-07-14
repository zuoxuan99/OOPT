// Self Practice
package P2SP;

public class UnitConverter {

    public static void main(String[] args) {
        double in = 0, cm = 0;
        System.out.println("Inches    Centimeters          Centimeters    Inches");

        for (int x = 0; x < 10; x++) {
            ++in;
            cm += 5;
            System.out.printf("%-10.1f%-21.2f", in, inchToCentimeter(in));
            System.out.printf("%-15.1f%-1.2f\n", cm, centimeterToInch(cm));
        }
    }

    public static double inchToCentimeter(double in) {
        double centimeter = in * 2.54;
        return (centimeter);
    }

    public static double centimeterToInch(double cm) {
        double inch = cm / 2.54;
        return (inch);
    }
}
