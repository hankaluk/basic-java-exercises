package a.verybasic.exercises;

//Enter the number of days and hours. Program returns the total number of hours (the result can equal to a real number).

import java.util.Scanner;

public class A1DaysAndHours {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double day, hour;
        final int HOURS_PER_DAY = 24;

        System.out.println("Enter days: ");
        day = scanner.nextDouble();
        System.out.println("Enter hours: ");
        hour = scanner.nextDouble();
        System.out.printf("The result is %.2f hours.", day * (double)HOURS_PER_DAY + hour);

    }

}
