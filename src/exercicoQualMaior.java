import java.util.Scanner;

public class exercicoQualMaior {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String maior = (a > b && a > c) ? "A" : (b > c) ? "B" : (c > a) ? "C" : "Inválido";

        System.out.println(maior);

        sc.close();
    }
}