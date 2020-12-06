package c.forloop.exercises;

// Print 10 rows. First row is number 1. Second row is number 12. Third row is 123...
// Use nested loop.

public class C16NestedLoopNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
