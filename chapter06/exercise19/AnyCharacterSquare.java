// This program prompts the user for a side length and a character, then prints a square of that character.
// Author: Arthur Alves

package chapter06.exercise19;

import java.util.Scanner;

public class AnyCharacterSquare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        int sideLength = input.nextInt();

        System.out.print("Enter the character that will be used to build and fill the square: ");
        char fill = input.next().charAt(0);

        squareOfAnyCharacter(sideLength, fill);

    }

    public static void squareOfAnyCharacter(int side, char fillCharacter) {

        for (int line = 1; line <= side; line++) {

            for (int column = 1; column <= side; column++) {
                System.out.print(fillCharacter);
            }

            System.out.println();
        }
    }
}
