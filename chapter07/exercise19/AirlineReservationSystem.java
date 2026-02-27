// Simulates a simple airline reservation system with 10 seats
// Divides seats into First Class and Economy Class, assigns available seats,
// offers alternatives if a class is full, and prints boarding passes
// Author: Arthur Alves

package chapter07.exercise19;

import java.util.Scanner;

public class AirlineReservationSystem {

    private static final boolean[] SEATS = new boolean[10];

    private static final int FIRST_CLASS = 1;
    private static final int ECONOMY_CLASS = 2;

    private static final int FIRST_CLASS_STARTING = 0;
    private static final int FIRST_CLASS_ENDING = 4;

    private static final int ECONOMY_CLASS_STARTING = 5;
    private static final int ECONOMY_CLASS_ENDING = 9;

    private static final int UNKNOWN_SEAT = -1;

    private static final int NO = 0;
    private static final int YES = 1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (!isFull()) {
            int flightClass = askForFlightClass(input);
            String flightClassText;

            int alternativeFlightClass;
            String alternativeFlightClassText;

            while (flightClass != FIRST_CLASS && flightClass != ECONOMY_CLASS) {
                System.out.println("Please type only valid options.");
                flightClass = askForFlightClass(input);
            }

            if (flightClass == FIRST_CLASS) {
                flightClassText = "First Class";
                alternativeFlightClassText = "Economy Class";
                alternativeFlightClass = ECONOMY_CLASS;
            } else {
                flightClassText = "Economy Class";
                alternativeFlightClassText = "First Class";
                alternativeFlightClass = FIRST_CLASS;
            }

            int seat = reserveSeat(flightClass);

            if (seat == UNKNOWN_SEAT) {
                System.out.println(flightClassText + " is Full.");
                int answer = askForAlternativeFlightClass(alternativeFlightClassText, input);

                while (answer != YES && answer != NO) {
                    System.out.println("Invalid input.");
                    answer = askForAlternativeFlightClass(alternativeFlightClassText, input);
                }

                if (answer == YES) {
                    seat = reserveSeat(alternativeFlightClass);
                    displayBoardingPass(alternativeFlightClassText, seat);
                } else {
                    System.out.println("Next flight leaves in 3 hours.");
                }
            } else {
                displayBoardingPass(flightClassText, seat);
            }
        }

        System.out.println("All the seats are booked.");
    }

    public static int askForFlightClass(Scanner input) {
        System.out.print("Please type 1 for First Class or 2 for Economy Class: ");
        return input.nextInt();
    }

    public static int askForAlternativeFlightClass(String alternativeFlightClassText, Scanner input) {
        System.out.println("Would you like to reserve a seat in " + alternativeFlightClassText + "?");
        System.out.print("Please type 1 for YES or 0 for NO: ");
        return input.nextInt();
    }

    public static boolean isFull() {
        for (boolean seat : SEATS) {
            if (!seat) {
                return false;
            }
        }
        return true;
    }

    public static int reserveSeat(int flightClass) {
        int startingSeat;
        int endingSeat;

        if (flightClass == FIRST_CLASS) {
            startingSeat = FIRST_CLASS_STARTING;
            endingSeat = FIRST_CLASS_ENDING;
        } else {
            startingSeat = ECONOMY_CLASS_STARTING;
            endingSeat = ECONOMY_CLASS_ENDING;
        }

        for (int seat = startingSeat; seat <= endingSeat; seat++) {
            if (!SEATS[seat]) {
                SEATS[seat] = true;
                return seat;
            }
        }

        return UNKNOWN_SEAT;
    }

    public static void displayBoardingPass(String flightClassText, int seat) {
        System.out.println("\n----- BOARDING PASS -----");
        System.out.println("Category: " + flightClassText);
        System.out.println("Seat number: " + (seat + 1));
        System.out.println("-------------------------\n");
    }
}
