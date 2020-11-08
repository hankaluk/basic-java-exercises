package b.conditional.exercises;

//Program asks question: "Would you like me to end? (A/N)".
//If A is pressed, program ends. If anything else is pressed, program prints "I'm going to end anyway!"

import java.util.Scanner;

public class B14EndAnyway {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char end;
        System.out.println("Would you like me to end? (A/N)");
        end = scanner.next().charAt(0);
        if (end == 'a' || end == 'A') {
            System.exit(0);
        } else {
            System.out.println("I'm going to end anyway!");
        }
    }
}
