package c.forloop.exercises;

// Create a program for testing the multiplication of numbers 1-10.
// Program will show random multiplication problems (e.g. 5*6=, 8*4= etc.)
// User solves the problem and enter the answer. If the answer is wrong, program returns the right answer.
// There's 10 math. problems in total. At the end, program shows how many errors were made.

import java.util.Random;
import java.util.Scanner;

public class C10MultiplicationExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int multi1, multi2, answer;
        int error = 0;
        System.out.println("Program will test your basic multiplication knowledge. Enter your answers:");
        for (int i = 0; i < 10; i++) {
            multi1 = r.nextInt(10) + 1;                //r.nextInt() * (maximum - minimum + 1) + minimum;
            multi2 = r.nextInt(10) + 1;
            System.out.printf("%d * %d = ", multi1, multi2);
            answer = scanner.nextInt();
            if (multi1 * multi2 != answer) {
                error += 1;
                System.out.println("Incorrect. The right answer is " + (multi1 * multi2) + ".");
            } else {
                System.out.println("Correct");
            }
        }
        System.out.printf("In 10 problems, you answered %d correctly and %d incorrectly.", 10 - error, error);
    }
}
