// Self Practice
package P3SP;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] denomination = {100, 50, 20, 10, 5, 1};
        int[] quantity = new int[denomination.length];
        int[] value = new int[denomination.length];
        for (int x = 0; x < 6; x++) {
            System.out.println("Please enter the Quantity of bank note(RM" + denomination[x] + "): ");
            quantity[x] = scan.nextInt();
        }
        int total = calculateValue(denomination, quantity, value);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Denomination(RM)          Quantity           Value (RM)");
        for (int x = 0; x < denomination.length; x++) {
            if (quantity[x] > 0) {
                System.out.printf("%15d%18d%22d\n", denomination[x], quantity[x], value[x]);
            }
        }
        System.out.println("Total = RM " + total);
    }

    public static int calculateValue(int denomination[], int quantity[], int value[]) {
        int total = 0;
        for (int x = 0; x < denomination.length; x++) {
            value[x] = denomination[x] * quantity[x];
            total += value[x];
        }
        return total;
    }
}
