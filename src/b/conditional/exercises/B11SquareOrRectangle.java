package b.conditional.exercises;

//Enter two positive numbers, which represent sides of a rectangle.
//If it's a square, program prints: "The square has a side length of ... units."
//If else: "The rectangle has sides of ... and ... units."

import java.util.Scanner;

public class B11SquareOrRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        System.out.println("Enter the first side of a rectangle [a positive number]:");
        num1 = scanner.nextDouble();
        System.out.println("Enter the second side of a rectangle [a positive number]:");
        num2 = scanner.nextDouble();

        if (num1 == num2) {
            System.out.printf("The square has a side length measuring %.2f units.", num1);
        } else {
            System.out.printf("The rectangle has sides measuring %.2f and %.2f units.", num1, num2);
        }
    }
}
