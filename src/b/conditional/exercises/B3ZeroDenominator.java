package b.conditional.exercises;

//Enter numbers x and y, calculate the expression 1/(x*y).
//If the denominator equals to zero, the program does not calculate the expression but prints warning.
//Yes, can be solved by exception. :)

import java.util.Scanner;

public class B3ZeroDenominator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numX, numY;

        System.out.println("There is an expression 1/(x*y). Calculate the result.");
        System.out.println("Enter the number x:");
        numX = scanner.nextDouble();
        System.out.println("Enter the number y:");
        numY = scanner.nextDouble();
        if (numX * numY == 0) {
            System.out.println("Warning! Your denominator is zero.");
        } else {
            System.out.printf("The result is 1/(%.2f*%.2f) = %.2f.", numX, numY, 1 / (numX * numY));
        }
    }
}
