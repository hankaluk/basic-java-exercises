package a.verybasic.exercises;

//Enter the speed in the m/s unit and convert to the km/h unit.

import java.util.Scanner;

public class A3SpeedConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed;
        final double CONVERSION_RATE = 3.6;

        System.out.println("Enter speed using m/s unit:");
        speed = scanner.nextDouble();
        System.out.printf("Your speed %.2f m/s equals to %.2f km/h.", speed, speed * CONVERSION_RATE);

    }
}
