// This enum represents traffic light states (RED, GREEN, YELLOW), each associated with a specific duration in seconds
// Provides a method to retrieve the duration for each light state
// Author: Arthur Alves
package chapter08.exercise10;

public enum TrafficLight {
    RED(15), GREEN(30), YELLOW(10);

    private final int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
