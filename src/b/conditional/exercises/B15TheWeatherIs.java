package b.conditional.exercises;

//Program asks what the weather is outside. It offers options: for example hot, cold, raining, fog, darkness, blizzard, etc.
//According to your choice, the program offers you an action: dress properly, go to the swimming pool etc.
//Do not use IF.

import java.util.Scanner;

public class B15TheWeatherIs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int outside;
        System.out.println("What is the weather outside?\nPick one of the options:\nweary heat = 1\nfreezing = 2\nraining = 3\nfoggy = 4\ndark = 5\nsnow storm = 6");
        outside = scan.nextInt();

        if (outside < 1 || outside > 6) {
            System.out.println("You picked an invalid option.");
        } else {
            switch (outside) {
                case 1: System.out.println("Hydrate and stay in the shade."); break;
                case 2: System.out.println("Dress properly."); break;
                case 3: System.out.println("Don't forget an umbrella."); break;
                case 4: System.out.println("Turn on your fog lights and drive carefully."); break;
                case 5: System.out.println("Rather go to bed."); break;
                case 6: System.out.println("Don't forget your hat and gloves."); break;
            }
        }
    }
}
