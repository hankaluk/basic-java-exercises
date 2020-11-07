package b.conditional.exercises;

//Enter two numbers (x, y). Program will calculate if the inequality of x+3<5y-1 is fulfilled.

import java.util.Scanner;

public class B1Inequality {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numX, numY;

        System.out.println("The inequlity is x+3<5y-1.");
        System.out.println("Enter the number x: ");
        numX = scanner.nextInt();
        System.out.println("Enter the number y: ");
        numY = scanner.nextInt();
        if (numX + 3 > 5 * numY - 1) {
            System.out.printf("Numbers %d and %d fulfill the inequality x+3<5y-1.", numX, numY);
        } else {
            System.out.printf("Numbers %d and %d do not fulfill the inequality x+3<5y-1.", numX, numY);
        }
    }
}

