package a.verybasic.exercises;

//Make a program that asks for the length of a running track in meters, after that asks for the runner's time on the track in seconds.
//Program prints the average runner's speed on the track in km/h.

import java.util.Scanner;

public class A10AvgRunnerSpeed {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double trackLength, runnerTime, avgSpeed;
        final double CONVERSION_RATE = 3.6;

        System.out.println("Enter the length of the running track in meters: ");
        trackLength = scanner.nextDouble();
        System.out.println("Enter the runner's time in seconds: ");
        runnerTime = scanner.nextDouble();
        avgSpeed = trackLength/runnerTime * CONVERSION_RATE;
        System.out.printf("The runner's average speed is %.2f km/h.",avgSpeed);
    }
}
