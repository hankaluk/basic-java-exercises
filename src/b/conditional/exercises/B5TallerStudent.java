package b.conditional.exercises;

//Create a program that reads the name and height of the first student, then do the same for the second student.
//Program prints the name of the taller student.

import java.util.Scanner;

public class B5TallerStudent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height1, height2;
        String name1;
        String name2;
        System.out.println("Enter the name of the first student:");
        name1 = scanner.nextLine();
        System.out.println("Enter the height of the first student:");
        height1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the name of the second student:");
        name2 = scanner.nextLine();
        System.out.println("Enter the height of the second student:");
        height2 = scanner.nextDouble();
        scanner.close();

        if (height1 > height2) {
            System.out.printf("%s is taller.", name1);
        } else if (height2 > height1) {
            System.out.printf("%s is taller.", name2);
        } else {
            System.out.printf("%s and %s are equally tall.", name1, name2);
        }
    }
}



