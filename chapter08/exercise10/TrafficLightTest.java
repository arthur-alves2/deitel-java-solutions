// This program tests the TrafficLight enum by iterating through all traffic light states and printing each light
// along with its associated duration
// Author: Arthur Alves
package chapter08.exercise10;

public class TrafficLightTest {

    public static void main(String[] args) {

        for (TrafficLight light : TrafficLight.values()) {
            System.out.println("Light: " + light);
            System.out.println("Time: " + light.getDuration());
            System.out.println("----------");
        }
    }
}
