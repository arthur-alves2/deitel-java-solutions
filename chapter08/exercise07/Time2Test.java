// Demonstrates the functionality of the Time2 class
// Author: Arthur Alves

package chapter08.exercise07;

public class Time2Test {

    public static void main(String[] args) {

        Time2 firstTime = createTime("firstTime", 20, 0, 0);
        displayTime("firstTime", firstTime);

        displayTime("firstTime", firstTime);
        testHour("firstTime", firstTime, 1);
        displayTime("firstTime", firstTime);

        displayTime("firstTime", firstTime);
        testMinute("firstTime", firstTime, 1);
        displayTime("firstTime", firstTime);

        displayTime("firstTime", firstTime);
        testSecond("firstTime", firstTime, 1);
        displayTime("firstTime", firstTime);


        Time2 secondTime = createTime("secondTime", 23, 59, 59);
        displayTime("secondTime", secondTime);

        testSecond("secondTime", secondTime, 1);
        displayTime("secondTime", secondTime);


        // Trying to create the third time with invalid hour
        try {
            Time2 thirdTime = createTime("thirdTime", -1, 30, 15);
        } catch (IllegalArgumentException e) {
            System.out.printf("%s: %s%n", "Error", e.getMessage());
        }

        try {
            Time2 thirdTime = createTime("thirdTime", 25, -1, -1);
        } catch (IllegalArgumentException e) {
            System.out.printf("%s: %s%n", "Error", e.getMessage());
        }

        // Trying to create the third time with invalid minute
        try {
            Time2 thirdTime = createTime("thirdTime", 15, -1, 30);
        } catch (IllegalArgumentException e) {
            System.out.printf("%s: %s%n", "Error", e.getMessage());
        }

        try {
            Time2 thirdTime = createTime("thirdTime", 15, 61, 30);
        } catch (IllegalArgumentException e) {
            System.out.printf("%s: %s%n", "Error", e.getMessage());
        }

        // Trying to create the third time with invalid second
        try {
            Time2 thirdTime = createTime("thirdTime", 15, 30, -1);
        } catch (IllegalArgumentException e) {
            System.out.printf("%s: %s%n", "Error", e.getMessage());
        }

        try {
            Time2 thirdTime = createTime("thirdTime", 15, 30, 61);
        } catch (IllegalArgumentException e) {
            System.out.printf("%s: %s%n", "Error", e.getMessage());
        }

    }

    public static Time2 createTime(String timeName, int hour, int minute, int second) {
        System.out.printf("%s: creating time%n", timeName);
        Time2 time = new Time2(hour, minute, second);
        System.out.printf("%s: time created%n", timeName);
        return time;
    }

    public static void displayTime(String timeName, Time2 time) {
        System.out.printf("%s: displaying time%n", timeName);
        System.out.println(timeName + ": " + time.toUniversalString());
    }

    public static void testSecond(String timeName, Time2 time, int seconds) {
        String message = "%s: tick %d ";
        message += seconds == 1 ? "time%n" : "times%n";
        System.out.printf(message, timeName, seconds);
        for (int i = 0; i < seconds; i++) {
            time.tick();
        }
    }

    public static void testMinute(String timeName, Time2 time, int minutes) {
        System.out.printf("%s: incrementing minutes by %d%n", timeName, minutes);
        for (int i = 0; i < minutes; i++) {
            time.incrementMinute();
        }
    }

    public static void testHour(String timeName, Time2 time,  int hours) {
        System.out.printf("%s: incrementing hours by %d%n", timeName, hours);
        for (int i = 0; i < hours; i++) {
            time.incrementHour();
        }
    }
}