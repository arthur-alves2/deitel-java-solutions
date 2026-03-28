// Test class for the Date class, checking constructors, leap year handling, formatting, and validation of dates
// Author: Arthur Alves

package chapter08.exercise14;

public class DateTest {
    public static void main(String[] args) {

        // ===============================
        // Testing constructor (int month, int day, int year)
        // ===============================
        try {
            Date date1 = new Date(2, 29, 2024); // leap year
            System.out.println("Constructor (int, int, int) works: " + date1.formatToLongDate());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Invalid test (non-leap year)
        try {
            Date invalidDate = new Date(2, 29, 2023); // not a leap year
            System.out.println(invalidDate.formatToLongDate());
        } catch (IllegalArgumentException e) {
            System.out.println("Expected error: " + e.getMessage());
        }

        // ===============================
        // Testing constructor (String monthName, int day, int year)
        // ===============================
        Date date2 = new Date("March", 15, 2023);
        System.out.println("Constructor (String, int, int): " + date2);

        // ===============================
        // Testing constructor (Month, int, Year)
        // ===============================
        Year year2022 = new Year(2022);
        Date date3 = new Date(Month.DECEMBER, 31, year2022);
        System.out.println("Constructor (Month, int, Year): " + date3.formatToDayOfYear());

        // ===============================
        // Testing constructor (int dayOfYear, int year)
        // ===============================
        Date date4 = new Date(60, 2024); // Feb 29 in leap year
        System.out.println("Constructor (dayOfYear, year): " + date4.formatToLongDate());

        // ===============================
        // Testing getDayOfYear()
        // ===============================
        System.out.println("Day of the year for date2: " + date2.getDayOfYear());

        // ===============================
        // Testing toString()
        // ===============================
        System.out.println("Default format of date3: " + date3);

        // ===============================
        // Testing invalid limits
        // ===============================
        try {
            Date invalidDate2 = new Date(0, 10, 2023); // invalid month
        } catch (IllegalArgumentException e) {
            System.out.println("Expected error (invalid month): " + e.getMessage());
        }

        try {
            Date invalidDate3 = new Date(13, 10, 2023); // invalid month
        } catch (IllegalArgumentException e) {
            System.out.println("Expected error (invalid month): " + e.getMessage());
        }
    }
}
