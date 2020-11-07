package b.conditional.exercises;

//Enter a year (starting 1600). Program prints the name of the state at the given year. Solve using else if.

import java.util.Scanner;

public class B7CzechSince1600 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.println("Enter a year between 1600 and present:");
        year = scanner.nextInt();
        if (year >= 2020) {
            System.out.println("It's in the future.");
        } else if (year >= 1993) {
            System.out.println("Czech Republic");
        } else if (year >= 1990) {
            System.out.println("Czech and Slovak Federative Republic");
        } else if (year >= 1960) {
            System.out.println("Czechoslovak Socialist Republic");
        } else if (year >= 1945) {
            System.out.println("Czechoslovak Republic");
        } else if (year >= 1939) {
            System.out.println("Protectorate of Bohemia and Moravia");
        } else if (year >= 1918) {
            System.out.println("Czechoslovakia");
        } else if (year >= 1867) {
            System.out.println("Austria-Hungary");
        } else if (year >= 1804) {
            System.out.println("Austrian Empire");
        } else if (year >= 1600) {
            System.out.println("Habsburg Empire");
        } else {
            System.out.println("You entered a wrong year.");
        }
    }
}
