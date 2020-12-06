package c.forloop.exercises;

// Create a program which plays the last hit to the golf ball.
// You're standing 3 meters away from a hole with the radius of 10 cm (so the distance is 2.95-3.05),
// your shaking hand has the bias of +-1m.
// How many times you hit the hole in 100 strokes. And which try was the first score.


import java.util.Random;

public class C12GolfHoleHits {
    public static void main(String[] args) {
        Random r = new Random();
        double stroke;
        int sumOfStrokes = 0, firstScore = 0;
        String str = "";
        for(int i = 1; i <= 100; i++) {
            stroke = (r.nextDouble() * 2) + 2;
            //r.NextDouble() * (maximum - minimum) + minimum;
            if (i % 10 == 0) {
                str = str + String.format("%4d.\t %-5.2f \n", i, stroke);
            } else {
                str = str + String.format("%4d.\t %-5.2f \t", i, stroke);
            }
            if(stroke >= 2.95 && stroke <= 3.05) {
                sumOfStrokes += 1;
                if(sumOfStrokes == 1) {
                    firstScore = i;
                }
            }
        }
        System.out.printf(str + "\nIn 100 strokes, you scored %d times. You scored for the first time in your try number %d.",sumOfStrokes, firstScore);
    }
}
