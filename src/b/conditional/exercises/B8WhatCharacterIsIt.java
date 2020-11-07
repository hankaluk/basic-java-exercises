package b.conditional.exercises;

//Enter a character. Program prints if it's a letter, a number, or other character. Solve using else if.

import java.util.Scanner;

public class B8WhatCharacterIsIt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char character;

        System.out.println("Enter a character (letter, number, other):");
        character = scanner.next().charAt(0);

        if (character >= 'a' && character <= 'z') {
            System.out.println("It's a lowercase letter.");
        } else if (character >= 'A' && character <= 'Z') {
            System.out.println("It's an uppercase letter.");
        } else if (character >= '0' && character <= '9') {
            System.out.println("It's a number.");
        } else {
            System.out.println("It's the other character.");
        }
    }
}
