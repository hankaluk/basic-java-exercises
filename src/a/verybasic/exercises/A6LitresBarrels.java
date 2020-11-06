package a.verybasic.exercises;

//Enter the number of barrels and how many litres in one barrel is (same amount in all barrels). Program returns the total volume of litres.

import java.util.Scanner;

public class A6LitresBarrels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int barrels;
        double litres;

        System.out.println("Enter the amount of barrels: ");
        barrels = scanner.nextInt();
        System.out.println("Enter amount of litres in one barrel: ");
        litres = scanner.nextDouble();
        System.out.printf("There's totally %.2f litres in %d barrel(s).", barrels * litres, barrels);
    }
}
