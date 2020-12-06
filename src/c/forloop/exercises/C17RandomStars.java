package c.forloop.exercises;

// Print 20 rows of random amount of stars.
// Use a nested loop.

import java.util.Random;

public class C17RandomStars {
    public static void main(String[] args) {
        Random r = new Random();
        int rNumber;
        for (int i = 1; i < 21; i++) {
            rNumber = r.nextInt(10) + 1;
            System.out.printf("  %-4d", rNumber);
            for (int j = 1; j <= rNumber; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
