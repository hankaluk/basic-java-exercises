package c.forloop.exercises;

//Randomly generate 20 whole numbers from the interval 10 - 50.
//Determine how their average differs from the mean value of the interval (30).

import java.util.Random;

public class C5MeanValueOfNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int ran, sum = 0;
        double avg;
        for (int i = 0; i < 20; i++) {
            ran = random.nextInt(41) + 10;
            System.out.println(ran);
            sum += ran;
        }
        avg = sum / 20.00;
        System.out.printf("The average of the generated numbers %.2f differs from the mean value by %.2f.", avg, avg - 30.00);
    }
}
