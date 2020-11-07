package b.conditional.exercises;

//The first car covered the route s1 in time t1, the second car covered the route s2 in time t2. Input all the information.
//Calculate the speed of both cars and print a message "...car is faster than... by ... km/h."

import java.util.Scanner;

public class B6FasterCar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s1, s2, t1, t2, speed1, speed2;
        final double CONVERSION_RATE = 3.6;
        final double SECONDS = 60;

        System.out.println("Enter the length of route for the first car in meters:");
        s1 = scanner.nextDouble();
        System.out.println("Enter the time in minutes in which the first car covered the route:");
        t1 = scanner.nextDouble();
        System.out.println("Enter the length of route for the second car in meters:");
        s2 = scanner.nextDouble();
        System.out.println("Enter the time in minutes in which the second car covered the route:");
        t2 = scanner.nextDouble();
        speed1 = s1 / (t1 * SECONDS) * CONVERSION_RATE;
        speed2 = s2 / (t2 * SECONDS) * CONVERSION_RATE;

        if (speed1 > speed2) {
            System.out.printf("The first car is faster than the second car by %.2f km/h.",speed1-speed2);
        } else if (speed2 > speed1) {
            System.out.printf("The second car is faster than the second car by %.2f km/h.",speed2-speed1);
        } else {
            System.out.println("Both cars are equally fast.");
        }
    }
}
