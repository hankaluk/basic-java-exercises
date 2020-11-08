package b.conditional.exercises;

//Program asks if it's a daytime and if it's hot outside (answer a/n).
//In case both answers are a, program offers to go to have a swim.
//Use only one IF statement with composite condition. Include the capital letter answers.

import java.util.Scanner;

public class B12IsItHotOutside {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char day, heat;
        System.out.println("Is it daytime? (a/n)");
        day = scanner.next().charAt(0);
        System.out.println("Is it hot outside? (a/n)");
        heat = scanner.next().charAt(0);

        if ((day == 'A' || day == 'a') && (heat == 'A' || heat == 'a')) {
            System.out.println("It's beautiful weather outside. Have a swim.");
        } else {
            System.out.println("It's not the right time for swimming. Try something else.");
        }
        //ternary operator
        String hotOutside = ((day == 'A' || day == 'a') && (heat == 'A' || heat == 'a') ? "It's beautiful weather outside. Have a swim." : "It's not the right time for swimming. Try something else.");
        System.out.println(hotOutside);
    }
}
