// This program uses a 2D array to store sales and displays them in a row-column table,
// showing totals for each product (rows) and each salesperson (columns)
// Author: Arthur Alves

package chapter07.exercise20;

import java.util.Scanner;

public class TotalSales {

    private static final int PRODUCTS = 5;
    private static final int SALESPERSONS = 4;
    private static final double[][] SALES = new double[PRODUCTS][SALESPERSONS];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        readAllSalespersonSales(input);
        printTable();
    }

    public static void readAllSalespersonSales(Scanner input) {
        for (int product = 0; product < SALES.length; product++) {
            System.out.printf("----- Product %d -----%n", (product + 1));

            System.out.print("Enter the price: ");
            double price = input.nextDouble();

            for (int salesPerson = 0; salesPerson < SALES[product].length; salesPerson++) {
                System.out.printf("Enter the amount sold by salesperson %d: ", (salesPerson + 1));
                double amountSold = input.nextDouble();
                SALES[product][salesPerson] = amountSold * price;
            }
        }
    }

    public static void printTable() {
        System.out.printf("%9s\t%s\t%s\t%s\t%s\t%s%n","", "Salesperson 1", "Salesperson 2", "Salesperson 3", "Salesperson 4", "Total");
        for (int product = 0; product < SALES.length; product++) {
            System.out.printf("Product %d\t", (product + 1));
            double productTotal = 0;

            for (int salesperson = 0; salesperson < SALES[product].length; salesperson++) {
                productTotal += SALES[product][salesperson];
                System.out.printf("%13.2f\t", SALES[product][salesperson]);
            }

            System.out.printf("%.2f\n", productTotal);
        }

        printSalespersonTotals();
    }

    public static void printSalespersonTotals() {
        System.out.printf("%-9s\t", "total");

        for (int salesperson = 0; salesperson < SALESPERSONS; salesperson++) {
            double salespersonTotal = 0;

            for (int product = 0; product < PRODUCTS; product++) {
                salespersonTotal += SALES[product][salesperson];
            }

            System.out.printf("%13.2f\t", salespersonTotal);
        }
    }
}
