package c.forloop.exercises;

//Enter the number of classes at school. Then enter how many students are in every class.
//Program calculates, how many students are at school and the average number of students per class.

import java.util.Scanner;

public class C6ClassesAtSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int schoolClasses, numStudents, sum = 0;
        double avg;
        String str = "";
        System.out.println("Enter the number of classes in a school.");
        schoolClasses = scanner.nextInt();

        for (int i = 0; i < schoolClasses; i++) {
            System.out.println("Enter the number of students in a class [larger than 0].");
            numStudents = scanner.nextInt();
            sum += numStudents;
            str = str + ("\nThere's " + numStudents + " students at class number " + (i + 1) + ".");
        }
        avg = (double) sum / schoolClasses;
        System.out.println(str);
        System.out.printf("Total number of students at school is %d.", sum);
        System.out.printf("\nThe average number of students at school is %.2f students per class.", avg);
    }
}
