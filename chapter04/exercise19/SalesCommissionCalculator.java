// Calculates a salesperson's total earnings from sales and commission
// Author: Arthur Alves

package chapter04.exercise19;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalSales = 0.0;
        System.out.print("Enter the number of the product or -1 to quit: ");
        int productID = input.nextInt();
        while (productID != -1) {
            System.out.printf("Enter the quantity sold for product %d: ", productID);
            int quantitySold = input.nextInt();
            if(productID == 1) {
                totalSales += 239.99 * quantitySold;
            } else if(productID == 2) {
                totalSales += 129.75 * quantitySold;
            } else if(productID == 3) {
                totalSales += 99.95 * quantitySold;
            } else if(productID == 4) {
                totalSales += 350.89 * quantitySold;
            }
            System.out.printf("%nEnter the number of the product or -1 to quit: ");
            productID = input.nextInt();
        }
        System.out.printf("Total Sales: %.2f%n", totalSales);
        System.out.printf("commissioned salary: %.2f", 200 + (0.09 * totalSales));
    }
}
