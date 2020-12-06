package c.forloop.exercises;

// A short program that returns ASCII table from number 65 to 100.
// Shows a table with two columns. One column is ascii number, second one is the character.

public class C11AsciiTable {
    public static void main(String[] args) {
        System.out.println("ASCII table 65-100");
        for (int i = 65; i <= 100; i++) {
            System.out.println("\t" + i + "\t" + (char) i);
        }
    }
}
