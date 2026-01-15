// Demonstrates the HealthProfile class by collecting user input and displaying health information.
// Author: Arthur Alves

package chapter03.exercise17;

import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String firstName = input.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();
        System.out.println("Enter you gender: ");
        String gender = input.nextLine();
        System.out.println("Enter your month of birth: ");
        int monthOfBirth = input.nextInt();
        System.out.println("Enter your day of birth: ");
        int dayOfBirth = input.nextInt();
        System.out.println("Enter your year of birth: ");
        int yearOfBirth = input.nextInt();
        System.out.println("Enter you height(m): ");
        double height = input.nextDouble();
        System.out.println("Enter your weight(kg): ");
        double weight = input.nextDouble();
        HealthProfile healthProfile = new HealthProfile(firstName, lastName, gender, monthOfBirth, dayOfBirth,
                yearOfBirth, height, weight);
        System.out.println("---------- DETAILS ----------");
        System.out.printf("First name: %s%n", healthProfile.getFirstName());
        System.out.printf("Last name: %s%n", healthProfile.getLastName());
        System.out.printf("Gender: %s%n", healthProfile.getGender());
        System.out.printf("Month of birth: %d%n", healthProfile.getMonthOfBirth());
        System.out.printf("Day of birth: %d%n", healthProfile.getDayOfBirth());
        System.out.printf("Year of birth: %d%n", healthProfile.getYearOfBirth());
        System.out.printf("Height: %.2f%n", healthProfile.getHeight());
        System.out.printf("Weight: %.2f%n", healthProfile.getWeight());
        System.out.printf("Age: %d%n", healthProfile.getAge());
        System.out.printf("BMI: %.2f%n%n", healthProfile.getBodyMassIndex());
        System.out.printf("Maximum Heart Rate: %d%n", healthProfile.getMaximumHeartRate());
        System.out.printf("Target Heart Rate: %.2f%n", healthProfile.getTargetHeartRate());
        System.out.println("---------- BMI VALUES ----------");
        System.out.println("Underweight:\tless than 18.5");
        System.out.println("Normal:\t\tbetween 18.5 and 24.9");
        System.out.println("Overweight:\tbetween 25 and 29.9");
        System.out.println("Obese:\t\t30 or greater");
    }
}
