package b.conditional.exercises;

//Enter a sum of money in CZK. After that pick the currency of the list (e.g. EUR, USD, JPY).
//Program recalculate the money sum to the selected currency.

import java.util.Scanner;

public class B17ExchangeOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double koruny;
        int currency;
        System.out.println("How much CZK you'd like to exchange?");
        koruny = scanner.nextDouble();
        System.out.println("Which currency you'd like to exchange it for?\nEnter the currency number:\nEUR: 1\nUSD: 2\nGBP: 3\nAUD: 4\nNZD: 5\nJPY: 6");
        currency = scanner.nextInt();

        switch (currency) {
            case 1: System.out.printf("For %.2f CZK you'll get %.2f EUR.", koruny, koruny / 24.88); break;
            case 2: System.out.printf("For %.2f CZK you'll get %.2f USD.", koruny, koruny / 22.95); break;
            case 3: System.out.printf("For %.2f CZK you'll get %.2f GBP.", koruny, koruny / 29.95); break;
            case 4: System.out.printf("For %.2f CZK you'll get %.2f AUD.", koruny, koruny / 15.41); break;
            case 5: System.out.printf("For %.2f CZK you'll get %.2f NZD.", koruny, koruny / 14.71); break;
            case 6: System.out.printf("For %.2f CZK you'll get %.2f JPY.", koruny, (koruny / 20.91) * 100 ); break;
            default: System.out.println("Invalid currency."); break;
        }
    }
}
