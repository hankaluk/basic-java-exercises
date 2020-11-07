package a.verybasic.exercises;

//Enter the lengths of legs of a right triangle. Using Pythagorean theorem, calculate the length of the hypotenuse.
//Check the result while using the lengths of legs 3 and 4. The result should be 5.

import java.util.Scanner;

public class A12HypotenuseLength {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double legA, legB, hypo;
        System.out.println("Enter the length of leg A: ");
        legA = scanner.nextDouble();
        System.out.println("Enter the length of leg B: ");
        legB = scanner.nextDouble();
        hypo = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
        System.out.printf("The right triangle with leg A = %.3f units and leg B = %.3f units has a hypotenuse = %.3f units.", legA, legB, hypo);
    }
}
