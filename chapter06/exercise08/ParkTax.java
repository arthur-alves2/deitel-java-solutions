// This program calculates parking fees based on hours parked
// Minimum $2 for up to 3 hours, $0.50 per extra hour, max $10
// Repeatedly inputs durations, shows each charge, and totals all charges
// Author: Arthur Alves

package chapter06.exercise08;

import java.util.Scanner;

public class ParkTax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalCharges = 0;

        System.out.print("Duration the vehicle was parked: ");
        double time = input.nextDouble();

        while (time != -1) {
            double charges = calculateCharges(time);
            System.out.printf("Charges: %.2f%n%n", charges);

            totalCharges += charges;

            System.out.print("Duration the vehicle was parked: ");
            time = input.nextDouble();
        }

        System.out.printf("Total charges: %.2f%n", totalCharges);
    }

    public static double calculateCharges(double time) {
        time = Math.ceil(time);
        double charges = time <= 3 ? 2.00 : 2.00 + (time - 3.00) * 0.50;

        if (charges > 10) charges = 10;

        return charges;
    }
}
