import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);

        int sumDigit = 0;
        int doubleDigit = 0;
        int total;
        int temp = 0, temp2 = 0;
        int creditCard;       //Question provide: 43589795, Answer: 50
        
        do {
            System.out.println("Please enter a valid Credit Card Number (8-digit): ");
            creditCard = scan.nextInt();

            if ((creditCard < 10000000)|(creditCard > 99999999)) {
                System.out.println("Invalid Credit Card Number.");
                System.out.println("Please Key in Again.\n");
            }
        } while((creditCard < 10000000)|(creditCard > 99999999));
        
        for (int x = 0; x < 9; x++) {
            if (x == 0) {
                temp = creditCard;
                temp2 = creditCard / 10;
            } else if (x > 4) {
                System.out.print(temp2 % 10 * 2 + " ");
                temp2 = temp2 / 100;
            } else {
                sumDigit += temp % 10;
                System.out.print(temp % 10 + "+");
                temp = temp / 100;
                if (x == 4) {
                    System.out.println("\b=" + sumDigit);
                }
            }
        }
        System.out.print("\n");
        for (int x = 0; x < 5; x++) {
            if (x == 0) {
                temp2 = creditCard / 10;
            } else {
                doubleDigit += (temp2 % 10 * 2 / 10) + (temp2 % 10 * 2 % 10);
                if (temp2 % 10 * 2 >= 10) {
                    System.out.print(temp2 % 10 * 2 / 10 + "+" + temp2 % 10 * 2 % 10 + "+");
                } else {
                    System.out.print(temp2 % 10 * 2 % 10 + "+");
                }

                temp2 = temp2 / 100;
                if (x == 4) {
                    System.out.println("\b=" + doubleDigit);
                }
            }
        }
        total = sumDigit + doubleDigit;
        System.out.println(+ sumDigit + "+" + doubleDigit + "=" + total);
        
        if (total % 10 == 0) {
            System.out.println("\nThe Credit Card is Valid!");
        }
        else {
            System.out.println("\nThe Credit Card is Invalid!");
        }
    }
}
