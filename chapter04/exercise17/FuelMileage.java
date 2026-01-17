// Calculates and displays fuel mileage for each trip and overall totals.
// Author: Arthur Alves

package chapter04.exercise17;

import java.util.Scanner;

public class FuelMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalKilometersDriven = 0;
        double totalLitersConsumed = 0;
        System.out.print("Enter the kilometers driven(km) or -1 to quit: ");
        int kilometersDriven = input.nextInt();
        while (kilometersDriven != -1) {
            System.out.print("Enter the liters consumed(L): ");
            int litersConsumed = input.nextInt();
            System.out.printf("Kilometers per liter (km/L): %.2f%n", (double) kilometersDriven / litersConsumed);
            totalKilometersDriven += kilometersDriven;
            totalLitersConsumed += litersConsumed;
            System.out.printf("%nEnter the kilometers driven(km) or -1 to quit: ");
            kilometersDriven = input.nextInt();
        }
        System.out.printf("Total of kilometers driven: %.2f%n", totalKilometersDriven);
        System.out.printf("Total of liters consumed: %.2f%n", totalLitersConsumed);
    }
}
