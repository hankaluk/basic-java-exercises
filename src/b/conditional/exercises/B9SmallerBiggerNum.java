package b.conditional.exercises;

//Enter 2 numbers, program returns "The first number is larger(smaller) than the second one."

import java.util.Scanner;

public class B9SmallerBiggerNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        System.out.println("Enter first number:");
        num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println("The first number is larger than the second one.");
        } else if (num2 > num1) {
            System.out.println("The first number is smaller than the second one.");
        } else {
            System.out.println("Your numbers are equal.");
        }
    }
}
