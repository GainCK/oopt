import java.util.Scanner;

public class P3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] items = {"Apples", "Bananas", "Oranges", "Grapes", "Mangoes"};
        double[] unitCosts = {2.00, 2.00, 2.50, 5.00, 5.00};
        int[] quantities = new int[items.length];

        System.out.println("Enter the quantity of each item:");
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + ": ");
            quantities[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.println();
        System.out.printf("%-15s %-15s %-15s\n", "Item", "Quantity", "Value (MYR)");

        for (int i = 0; i < items.length; i++) {
            if (quantities[i] > 0) {
                double value = quantities[i] * unitCosts[i];
                System.out.printf("%-15s %-15d %-15.2f\n", items[i], quantities[i], value);
            }
        }
    }
}