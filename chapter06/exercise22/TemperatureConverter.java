// This program converts a temperature between Celsius and Fahrenheit
// Author: Arthur Alves

package chapter06.exercise22;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temperature = input.nextDouble();

        System.out.println("[1] - Celsius");
        System.out.println("[2] - Fahrenheit");

        System.out.print("Enter the temperature scale desired: ");
        int scale = input.nextInt();

        double convertedTemperature = scale == 1 ? celsius(temperature) : fahrenheit(temperature);

        System.out.println("Converted temperature: " + convertedTemperature);
    }

    public static double celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    public static double fahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }
}
