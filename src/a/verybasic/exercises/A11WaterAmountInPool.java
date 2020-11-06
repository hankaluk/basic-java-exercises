package a.verybasic.exercises;

//Create a program that asks for a diameter and height of the swimming pool (both in meters).
//Program prints how many tons of water fits in it (1m3 equals to 1 ton of water).

import java.util.Scanner;

public class A11WaterAmountInPool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double diameter, height, radius, waterTons;
        System.out.println("Enter your swimming pool's diameter: ");
        diameter = scanner.nextDouble();
        radius = diameter / 2.0;
        System.out.println("Enter your swimming pool's height: ");
        height = scanner.nextDouble();
        System.out.printf("Your swimming pool can hold %.2f tons of water.", Math.PI * Math.pow(radius, 2) * height);
    }
}
