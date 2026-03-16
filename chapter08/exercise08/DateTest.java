// Demonstrates the functionality of the Date class
// Author: Arthur Alves

package chapter08.exercise08;

public class DateTest {

    public static void main(String[] args) {

        Date date1 = new Date(1, 1, 2026);
        testDays(date1, "date1", 31);

        Date date2 = new Date(1, 1, 2026);
        testDays(date2, "date2", 365);
    }

    public static void testDays(Date date, String name, int days) {
        System.out.println(name + ": " + date + " (before the test)");
        for (int day = 0; day < days; day++) {
            date.nextDay();
            System.out.println(name + ": " + date);
        }
        System.out.println(name + ": " + date + " (after the test)");
    }
}
