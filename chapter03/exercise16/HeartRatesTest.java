// Class that demonstrates the functionality of the HeartRates class
// Author: Arthur Alves

package chapter03.exercise16;

import java.util.Scanner;

public class HeartRatesTest {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();
        System.out.println("Enter your month of birth: ");
        int monthOfBirth = input.nextInt();
        System.out.println("Enter your day of birth: ");
        int dayOfBirth = input.nextInt();
        System.out.println("Enter you year of birth: ");
        int yearOfBirth = input.nextInt();
        HeartRates heartRates1 = new HeartRates(firstName, lastName, monthOfBirth, dayOfBirth, yearOfBirth);
        System.out.printf("First name: %s%n", heartRates1.getFirstName());
        System.out.printf("Last name: %s%n", heartRates1.getLastName());
        System.out.printf("Month of birth: %d%n", heartRates1.getMonthOfBirth());
        System.out.printf("Day of birth: %d%n", heartRates1.getDayOfBirth());
        System.out.printf("Year of birth: %d%n", heartRates1.getYearOfBirth());
        System.out.printf("Age: %d%n", heartRates1.getAge());
        System.out.printf("Maximum heart rate: %d%n", heartRates1.getMaximumHeartRate());
        System.out.printf("Target heart rate: %.2f%n", heartRates1.getTargetHeartRate());
    }
}
