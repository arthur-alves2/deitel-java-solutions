// Reads a student's grade, computes quality points, and displays the result
// Author: Arthur Alves

package chapter06.exercise28;

import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student's grade: ");
        int grade = input.nextInt();
        System.out.printf("Quality points: %d%n", qualityPoints(grade));
    }

    public static int qualityPoints(int grade) {
        if (grade == 100) {
            return 4;
        } else if (grade > 60) {
            return grade / 10 - 5;
        } else {
            return 0;
        }
    }
}
