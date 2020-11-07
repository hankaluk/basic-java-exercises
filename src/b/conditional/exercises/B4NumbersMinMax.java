package b.conditional.exercises;

//Enter 3 numbers, program will calculate, which one is max and which one is min.

import java.util.Scanner;

public class B4NumbersMinMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, num3;
        double min, max;
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();
        System.out.print("Enter third number: ");
        num3 = scanner.nextDouble();

        min = max = num1;
        if (num2 > max) max = num2;
        if (num3 > max) max = num3;
        if (num2 < min) min = num2;
        if (num3 < min) min = num3;

        if (min == max) {
            System.out.println("All your numbers are equal.");
        }
        else {
            System.out.printf("You entered numbers %.2f, %.2f, %.2f.\nThe maximum is %.2f.\nThe minimum is %.2f.", num1, num2, num3, max, min);
        }
    }
}
