package a.verybasic.exercises;

//Enter radians, program returns degrees.

import java.util.Scanner;

public class A9DegreeConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radian;
        System.out.println("Enter radians: ");
        radian = scanner.nextDouble();
        System.out.printf("%.3f rad equals to %.3f°.", radian, (180 / Math.PI) * radian);
    }
}
