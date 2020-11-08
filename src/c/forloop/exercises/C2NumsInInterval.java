package c.forloop.exercises;

//Program generates 10 random numbers (from -100 to 100). Determine how many of them are in a particular interval (e.g. 10-50).

import java.util.Random;

public class C2NumsInInterval {
    public static void main(String[] args) {
        Random random = new Random();
        int ran, sum = 0;
        for (int i = 0; i < 10; i++) {
            ran = random.nextInt(201) - 100;
            if (ran >= 10 && ran <= 50) {
                sum++;
                System.out.printf("Is number %d in interval 10-50?\t\tYES\n", ran);
            } else {
                System.out.printf("Is number %d in interval 10-50?\t\n", ran);
            }
        }
        System.out.printf("\nThere is/are in total %d number(s) in the interval 10-50.", sum);
    }
}
