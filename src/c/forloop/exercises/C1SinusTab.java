package c.forloop.exercises;

//Print a table of sinus function from 0 to 2*PI with a step of 0,1.

public class C1SinusTab {
    public static void main(String[] args) {
        for (int i = 0; i < Math.PI * 20; i++) {
            System.out.printf("\nsinus %.4f is %.4f", i / 10.00, Math.sin(i / 10.00));
        }
    }
}
