package b.conditional.exercises;

//Enter the number of a month (1-12). Program returns, how many days the month has
//(for easier results February has just 28 days). Run using IF and CASE.

import java.util.Scanner;

public class B18DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;
        System.out.println("Enter the number of the month [1-12].");
        month = scanner.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.printf("The month number %d has 31 days.",month); break;
            case 2: System.out.printf("The month number %d has 28 days.", month); break;
            case 4:
            case 6:
            case 9:
            case 11:System.out.printf("The month number %d has 30 days.", month); break;
            default: System.out.println("Invalid month."); break;
        }

        if (month >= 1 && month <= 12) {
            if (month == 2) {
                System.out.printf("\nThe month number %d has 28 days.", month);
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.printf("\nThe month number %d has 30 days.", month);
            } else {
                System.out.printf("\nThe month number %d has 31 days.", month);
            }
        } else {
            System.out.println("Invalid month.");
        }
    }
}
