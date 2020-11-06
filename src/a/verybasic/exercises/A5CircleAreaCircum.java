package a.verybasic.exercises;

//Enter a circle radius. The program returns its area (P=PIr2) and its circumference (o=2PIr).
//The units are not defined.

import java.util.Scanner;

public class A5CircleAreaCircum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius, area, circumference;

        System.out.println("Enter the circle radius: ");
        radius = scanner.nextDouble();
        area = Math.PI * Math.pow(radius,2.0);
        circumference = 2 * Math.PI * radius;
        System.out.printf("The circle has radius %.2f.\nThe circle's area is %.2f.\nThe circle's circumference is %.2f.", radius, area, circumference);
    }
}
