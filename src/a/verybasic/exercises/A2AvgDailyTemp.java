package a.verybasic.exercises;

//Enter the temperatures measured at 6:00, 12:00 and 18:00. The program prints the daily average temperature.

import java.util.Scanner;

public class A2AvgDailyTemp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double temp6, temp12, temp18;
        double avg;

        System.out.println("Enter the temperature at 6:00: ");
        temp6 = scanner.nextDouble();
        System.out.println("Enter the temperature at 12:00: ");
        temp12 = scanner.nextDouble();
        System.out.println("Enter the temperature at 18:00: ");
        temp18 = scanner.nextDouble();

        avg = (temp6 + temp12 + temp18) / 3.0;
        System.out.printf("The average daily temperature is %.2f°C.", avg);

    }

}
