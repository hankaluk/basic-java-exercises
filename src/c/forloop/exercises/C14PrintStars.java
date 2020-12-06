package c.forloop.exercises;

// Variation1: Print 1 star (*) in first row, 2 stars in second row and so on till the tenth row.
// Then decrease the number of stars back to 1 star.
// Variation2: Same principle as the first variation, but this time print 2 stars on the first row, 4 stars on the second one and so on.
// Variation3: Same principle but the first and second rows will have 1 star, third and fourth rows will have 2 stars.

public class C14PrintStars {
    public static void main(String[] args) {
        // Variation 1:
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = 9; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // Variation 2:
        for (int i = 0; i <= 10; i += 2) {
            for (int j = 0; j <= i; j += 2) {
                System.out.print("* * ");
            }
            System.out.print('\n');
        }
        for (int i = 8; i >= 0; i -= 2) {
            for (int j = i; j >= 0; j -= 2) {
                System.out.print("* * ");
            }
            System.out.println();
        }

        // Variation 3:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j += 2) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = 9; i >= 0; i--) {
            for (int j = i; j >= 0; j -= 2) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // Variation 3 with 3 nested for loops:
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 2; k++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
        for (int i = 9; i >= 0; i--) {
            for (int k = 0; k < 2; k++) {
                for (int j = i; j >= 0; j--) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
}
