import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        for (int i = 1; i < numeros.length; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }

    }
}
