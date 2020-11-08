package c.forloop.exercises;

//Enter a number. Program prints the sum of all numbers from 1 till the given number.

import java.util.Scanner;

public class C8SumOfGivenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, sum = 0;
        System.out.println("Enter a whole positive number:");
        number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.print(i + "\t");
            sum += i;
        }
        System.out.printf("\nThe sum of all numbers from 1 to %d is %d.", number, sum);
    }
}
