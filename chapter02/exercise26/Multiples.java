// This program reads two integers from the user and determines whether the first integer is a multiple of the second integer. It then prints the result
// Author: Arthur Alves

package chapter02.exercise26;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int firstInteger = input.nextInt();

        System.out.println("Enter the second integer: ");
        int secondInteger = input.nextInt();
        
        if (firstInteger % secondInteger == 0) {
            System.out.printf("%d is multiple of %d %n", firstInteger, secondInteger);        
        }
        
        if (firstInteger % secondInteger != 0) {
            System.out.printf("%d is not multiple of %d %n", firstInteger, secondInteger);
        }
    }
}
