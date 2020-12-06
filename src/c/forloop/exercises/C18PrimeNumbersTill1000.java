package c.forloop.exercises;

// Print all prime numbers till the number 1000. Use modulo.

public class C18PrimeNumbersTill1000 {
    public static void main(String[] args) {
        boolean prime;
        for (int i = 2; i < 1000; i++) {
            prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.print(i + " | ");
            }
        }
    }
}
