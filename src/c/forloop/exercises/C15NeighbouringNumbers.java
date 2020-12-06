package c.forloop.exercises;

// Generate 100 random integer numbers from 1 to 5.
// If there are two same numbers next to each other, print them and their ordinal numbers.

import java.util.Random;

public class C15NeighbouringNumbers {
    public static void main(String[] args) {
        Random r = new Random();
        int number1 = 0, number2;
        String report = "";
        for (int i = 0; i < 100; i++) {
            number2 = r.nextInt(6) + 1;
            if((i + 1) % 10 == 0) {
                System.out.println(number2 + " | ");
            } else {
                System.out.print(number2 + " | ");
            }

            if (number2 == number1) {
                report = report + "\nTwo numbers " + number2 + " were drawn. Their ordinal numbers are " + i + " and " + (i + 1) + ".";
            }
            number1 = number2;
        }
        System.out.println(report);
    }
}
