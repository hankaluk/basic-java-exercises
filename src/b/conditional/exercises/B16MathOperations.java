package b.conditional.exercises;

//Enter two numbers, after that there will be a list of mathematical operations: addition, subtraction, multiplication, division or end.
//The program prints the result of the chosen operation or it ends.

import java.util.Scanner;

public class B16MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operation;
        System.out.println("Enter first number:");
        num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        num2 = scanner.nextDouble();
        System.out.println("What mathematical operation you'd like to perform.\nEnter the proper symbol:\naddition (+)\nsubtraction (-)\nmultiplication (*)\ndivision(/)\nto end(E)");
        operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.printf("\n%.2f + %.2f = %.2f", num1, num2, num1 + num2);
                break;
            case '-':
                System.out.printf("\n%.2f - %.2f = %.2f", num1, num2, num1 - num2);
                break;
            case '*':
                System.out.printf("\n%.2f * %.2f = %.2f", num1, num2, num1 * num2);
                break;
            case '/':
                System.out.printf("\n%.2f / %.2f = %.2f", num1, num2, num1 / num2);
                break;
            case 'e':
            case 'E':
                break;
            default:
                System.out.print("Invalid operation.");
                break;
        }
    }
}
