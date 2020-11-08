package c.forloop.exercises;

//Enter a whole number (up to 100), program prints all the divisors of the number (use the modulo).

import java.util.Scanner;

public class C9NumberDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        String str = "";
        boolean prime = true;

        System.out.println("Enter a whole number in a range of 3-100.\nProgram returns its divisors.");
        number = scanner.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                str = str + i + "  ";
                prime = false;
            }
        }
        if (prime) {
            System.out.println("The number " + number + " is a prime number.");
        } else {
            System.out.println("The number " + number + " divisible by: " + str);
        }
    }
}
