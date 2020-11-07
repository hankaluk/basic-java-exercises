package b.conditional.exercises;

//Enter a number. Program returns "The square root of number ... is ..."
//or prints "I'm not going to calculate the square root of a negative number."

import java.util.Scanner;

public class B10SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;

        System.out.println("Enter a number:");
        number = scanner.nextDouble();
        if (number < 0) {
            System.out.println("I'm not going to calculate the square root of a negative number!");
        } else {
            System.out.printf("The square root of number %.2f is %.2f.", number, Math.sqrt(number));
        }
    }
}
