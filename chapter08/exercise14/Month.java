// Represents the months of the year with attributes for the month name, number and number of days
// Provides utility methods to retrieve a month by its name or number, and to get the number of days in the month,
// considering leap years for February
// Author: Arthur Alves

package chapter08.exercise14;

public enum Month {

    JANUARY("January", 1, 31), FEBRUARY("February", 2, 28), MARCH("March", 3, 31), APRIL("April", 4, 30),
    MAY("May", 5, 31), JUNE("June", 6, 30), JULY("July", 7, 31), AUGUST("August", 8, 31), SEPTEMBER("September", 9, 30),
    OCTOBER("October", 10, 31), NOVEMBER("November", 11, 30), DECEMBER("December", 12, 31);

    private final String name;
    private final int number;
    private final int days;

    Month(String name, int number, int days) {
        this.name = name;
        this.number = number;
        this.days = days;
    }

    public static Month getMonthByNumber(int monthNumber) {
        for (Month month : Month.values()) {
            if (month.getNumber() == monthNumber) {
                return month;
            }
        }

        throw new IllegalArgumentException(String.format("Month number (%d) must be greater than or equal to 1 and" +
                " less than or equal to 12", monthNumber));
    }

    public static Month getMonthByName(String monthName) {
        for (Month month : Month.values()) {
            if (month.getName().equals(monthName)) {
                return month;
            }
        }

        throw new IllegalArgumentException(String.format("Month name (%s) must be written correctly and" +
                " capitalized", monthName));
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getDays(boolean leap) {
        if (this == FEBRUARY && leap) {
            return 29;
        }
        return days;
    }
}