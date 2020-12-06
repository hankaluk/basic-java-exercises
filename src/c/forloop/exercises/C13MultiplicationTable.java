package c.forloop.exercises;

// Print the multiplication table for number 1-10: 10 columns (+header), 10 rows (+header), means 1st row and 1st column are headers.

public class C13MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.print('\n');
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.print('\n');
        }
    }
}
