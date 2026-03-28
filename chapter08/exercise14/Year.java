// Represents a year with attributes for year number, leap year status, and total days
// This class encapsulates the logic for determining if a year is a leap year
// and provides the total number of days in the year
// Author: Arthur Alves

package chapter08.exercise14;

public class Year {

    private final int year;
    private final boolean isLeap;
    private final int days;

    public Year(int year) {
        if (year < 1) {
            throw new IllegalArgumentException(String.format("Year (%d) must be greater or equal to 1", year));
        }

        this.year = year;
        this.isLeap = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        this.days = isLeap ? 366 : 365;
    }

    public int getYear() {
        return year;
    }

    public boolean isLeap() {
        return isLeap;
    }

    public int getDays() {
        return days;
    }
}
