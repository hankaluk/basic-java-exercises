package b.conditional.exercises;

//Enter a, b, c. Program calculates roots of the quadratic equation a*x^2 + b*x + c = 0.

import java.util.Scanner;

public class B13QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, x1, x2, D;
        System.out.println("Enter the number a of the quadratic equation ax^2+bx+c=0.");
        a = scanner.nextDouble();
        System.out.println("Enter the number b of the quadratic equation ax^2+bx+c=0.");
        b = scanner.nextDouble();
        System.out.println("Enter the number c of the quadratic equation ax^2+bx+c=0.");
        c = scanner.nextDouble();
        //Discriminant:
        D = (b * b) - (4 * a * c);

        System.out.println("The solution of the quadratic equation ax^2+bx+c=0 is:");
        if (D > 0) {
            x1 = ((-b) + (double)Math.sqrt(D)) / (2 * a);
            x2 = ((-b) - (double)Math.sqrt(D)) / (2 * a);
            System.out.printf("Two real roots x: %.2f and %.2f.", x1, x2);
        } else if (Math.abs(D) < 1.0E-20) {
            x1 = ((-b) + (double)Math.sqrt(D)) / (2 * a);
            System.out.printf("One double root %.2f.", x1);
        } else {
            System.out.print("Complex root -1±i*2^0.5.");
        }
    }
}
