package a.verybasic.exercises;

//Enter the amount of money deposited in a bank, the interest rate and deposit time. Calculate the account balance after the expiration of the deposit time.
//Do not calculate the interest of the interest rate.

import java.util.Scanner;

public class A4InterestRate {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double money, interest, moneySum;
        int years;

        System.out.println("Enter the amount of money deposited in bank: ");
        money = scanner.nextDouble();
        System.out.println("Enter the interest rate: ");
        interest = scanner.nextDouble();
        System.out.println("Enter years of money deposit: ");
        years = scanner.nextInt();

        moneySum = money + (money*interest*years/100.0);
        System.out.printf("Calculated balance is %.3f.",moneySum);

    }

}
