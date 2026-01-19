// This program prints a hollow square of asterisks with a user-specified side length between 1 and 20
// Author: Arthur Alves

package chapter04.exercise29;

import java.util.Scanner;

public class AsteriskSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side length of the square between 1 and 20: ");
        int sideLenght = input.nextInt();
        while (sideLenght < 1 || sideLenght > 20) {
            System.out.print("Error! Please enter the side lenght between 1 and 20: ");
            sideLenght = input.nextInt();
        }
        int line = 1;
        int column = 1;
        while (line <= sideLenght) {
            while (column <= sideLenght) {
                if (line == 1 || line == sideLenght) {
                    System.out.print("*");
                } else if(column == 1 || column == sideLenght) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                column++;
            }
            System.out.println();
            column = 1;
            line++;
        }
    }
}
