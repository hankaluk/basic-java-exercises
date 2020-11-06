package a.verybasic.exercises;

//Enter your expected and real profit. Program prints how many percent you reached.

import java.util.Scanner;

public class A8ExpectedRealProfit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double expect, real;
        System.out.println("Enter your expected profit: ");
        expect = scanner.nextDouble();
        System.out.println("Enter your real profit: ");
        real = scanner.nextDouble();
        System.out.printf("You reached %.2f%% of your expected profit.", real/expect * 100.00);
    }
}
