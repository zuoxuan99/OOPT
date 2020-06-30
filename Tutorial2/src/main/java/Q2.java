
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = scan.nextInt();
        if (isLeapYear(year)) {
            System.out.println("Is Leap Year.");
        } else {
            System.out.println("Is not Leap Year.");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year < 1582 || !(year % 100 == 0) || year % 400 == 0));
        //https://slate.com/technology/2016/02/the-math-behind-leap-years.html
    }
}
