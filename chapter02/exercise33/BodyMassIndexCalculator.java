// This program calculates your BMI from height (m) and weight (kg) and shows your category
// Author: Arthur Alves

package chapter02.exercise33;

import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height(m): ");
        double height = input.nextDouble();
        System.out.println("Enter your weight(kg): ");
        double weight = input.nextDouble();
        System.out.printf("Your BMI: %f%n", weight / (height * height));
        System.out.println("BMI VALUES");
        System.out.println("Underweight:\tless than 18.5");
        System.out.println("Normal:\t\tbetween 18.5 and 24.9");
        System.out.println("Overweight:\tbetween 25 and 29.9");
        System.out.println("Obese:\t\t30 or greater");
    }
}
