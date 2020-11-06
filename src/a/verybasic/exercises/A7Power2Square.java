package a.verybasic.exercises;

//Enter a number. Program prints "... squared equals... "

import java.util.Scanner;

public class A7Power2Square {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;
        System.out.println("Enter a number (decimals allowed): ");
        number = scanner.nextDouble();
        System.out.printf("%.2f squared equals %.2f", number, Math.pow(number,2.0));
    }
}