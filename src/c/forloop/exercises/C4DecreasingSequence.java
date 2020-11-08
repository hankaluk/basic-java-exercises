package c.forloop.exercises;

//Print the decreasing sequence of numbers from 8 to -8.
//Variation: print the same sequence but this time use only even numbers. (DO NOT USE IF)

public class C4DecreasingSequence {
    public static void main(String[] args) {
        for (int i = 8; i >= -8; i -= 2)
            System.out.println(i);
        System.out.println();
        for (int i = 8; i >= -8; i--)
            System.out.println(i);
    }
}
