// Represents a date with day, month, and year, supporting multiple formats for input and output
// This class provides overloaded constructors to create Date objects from different input formats,
// methods to format the date in various ways and uses the Month enum and Year class to encapsulate month and year logic
// Author: Arthur Alves

package chapter08.exercise14;

public class Date {

    private Month month;
    private int day;
    private final Year year;

    public Date(int monthNumber, int day, int year) {
        this(Month.getMonthByNumber(monthNumber), day, new Year(year));
    }

    public Date(String monthName, int day, int year) {
        this(Month.getMonthByName(monthName), day, new Year(year));
    }

    public Date(Month month, int day, Year year) {
        this.year = year;
        boolean isLeap = year.isLeap();
        this.month = month;

        if (day < 1 || day > month.getDays(isLeap)) {
            throw new IllegalArgumentException(String.format("Day (%d) for month (%s) and year (%d) must be greater" +
                            " than or equal to 1 and less than or equal to %d", day, month.getName(), year.getYear(),
                    month.getDays(isLeap)));
        }

        this.day = day;
    }

    public Date(int dayOfYear, int year) {
        this.year = new Year(year);
        boolean isLeap = this.year.isLeap();

        if (dayOfYear < 1 || dayOfYear > this.year.getDays()) {
            throw new IllegalArgumentException(String.format("Day of year (%d) must be less than or" +
                    " equal to %d", dayOfYear, this.year.getDays()));
        }

        int remainingDays = dayOfYear;
        for (Month month : Month.values()) {
            if (remainingDays <= month.getDays(isLeap)) {
                this.month = month;
                this.day = remainingDays;
                break;
            }

            remainingDays -= month.getDays(isLeap);
        }
    }

    public int getDayOfYear() {
        boolean isLeap = year.isLeap();
        int dayOfYear = 0;
        for (Month month : Month.values()) {
            if (this.month == month) {
                dayOfYear += day;
                break;
            }

            dayOfYear += month.getDays(isLeap);
        }

        return dayOfYear;
    }

    public String formatToLongDate() {
        return String.format("%s %02d, %04d", month.getName(), day, year.getYear());
    }

    public String formatToDayOfYear() {
        return String.format("%03d %04d", getDayOfYear(), year.getYear());
    }

    public String toString()  {
        return String.format("%02d/%02d/%04d", month.getNumber(), day, year.getYear());
    }
}
