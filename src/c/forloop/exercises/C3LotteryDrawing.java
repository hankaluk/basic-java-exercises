package c.forloop.exercises;

//Create a program, that draws 5 lottery numbers (1-49). In this case, numbers can be repeated.

import java.util.Random;

public class C3LotteryDrawing {
    public static void main(String[] args) {
        Random random = new Random();
        int lottery;
        String draw = "";
        for (int i = 0; i < 5; i++) {
            lottery = random.nextInt(49) + 1;
            draw = draw + lottery + "\n";
        }
        System.out.println("The drawn lottery numbers are:\n" + draw);
    }
}
