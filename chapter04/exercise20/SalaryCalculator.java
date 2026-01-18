// Calculates employees' gross pay including regular and overtime hours
// Author: Arthur Alves

package chapter04.exercise20;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of hours worked this week(-1 to quit): ");
        double hoursWorked = input.nextDouble();
        while (hoursWorked != -1) {
            System.out.print("Enter the employee’s hourly wage: ");
            double hourlyWage = input.nextDouble();
            double overtime;
            double grossPay;
            if (hoursWorked > 40) {
                overtime = hoursWorked - 40;
                System.out.printf("Overtime hours worked: %.2f%n", overtime);
                grossPay = 40 * hourlyWage;
                grossPay += overtime * (1.5 * hourlyWage);
            } else {
                System.out.println("The employee didn’t work overtime");
                grossPay = hourlyWage * hoursWorked;
            }
            System.out.printf("Gross pay: %.2f%n%n", grossPay);
            System.out.print("Enter the number of hours worked this week(-1 to quit): ");
            hoursWorked = input.nextDouble();
        }
    }
}
