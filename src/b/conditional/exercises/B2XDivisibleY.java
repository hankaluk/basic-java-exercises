package b.conditional.exercises;

//Enter 2 numbers (x, y). Program prints if number x is divisible by number y.

import java.util.Scanner;

public class B2XDivisibleY {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numX, numY;

        System.out.println("Enter the whole number x: ");
        numX = scanner.nextInt();
        System.out.println("Enter the whole number x: ");
        numY = scanner.nextInt();
        if (numX % numY == 0) {
            System.out.printf("Yes, number %d is divisible by number %d.", numX, numY);
        } else {
            System.out.printf("No, number %d is not divisible by number %d.", numX, numY);
        }
    }
}
