// This program uses a switch statement to calculate total sales for multiple products sold
// Author: Arthur Alves

package chapter05.exercise17;

import java.util.Scanner;

public class SalesCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalSales = 0.0;

        while (true) {

            System.out.print("Product number: ");
            int productNumber = input.nextInt();

            if (productNumber == -1) break;

            System.out.print("Quantity sold: ");
            int quantitySold = input.nextInt();

            switch (productNumber) {
                case 1:
                    totalSales += quantitySold * 2.98;
                    break;
                case 2:
                    totalSales += quantitySold * 4.50;
                    break;
                case 3:
                    totalSales += quantitySold * 9.98;
                    break;
                case 4:
                    totalSales += quantitySold * 4.49;
                    break;
                case 5:
                    totalSales+= quantitySold * 6.87;
                    break;
            }
        }

        System.out.printf("%nTotal sales: %.2f", totalSales);

    }
}
