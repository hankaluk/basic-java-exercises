package c.forloop.exercises;

//Simulate minute after minute the exchange rate of CZK to EUR for 20 minutes.
//The rate would fluctuate between 26 (included) and 28 (excluded) CZK/Euro.
//Program prints, using mod, 5 numbers in every row (separated by tab).

import java.util.Random;

public class C7EuroExchangeRate {
    public static void main(String[] args) {
        Random random = new Random();
        double euro;
        for (int i = 1; i <= 20; i++) {
            euro = (random.nextDouble() * 2) + 26; //r.nextDouble() * (maximum - minimum) + minimum;
            if (i % 5 == 0) {
                System.out.printf("\t%.3f\n", euro);
            } else {
                System.out.printf("\t%.3f", euro);
            }
        }
    }
}
