import java.util.Scanner;

public class IdadeDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade expressa em anos, meses e dias: ");
        int anos = sc.nextInt();
        int meses = sc.nextInt();
        int dias = sc.nextInt();

        int total = anos * 365 + meses * 30 + dias;

        System.out.println("Sua idade em dias é igual a: " + total);

        sc.close();

    }
}


/* public class Solution {
    public static void main(String[] args) {
        int anos = 5;
        int meses = 4;
        int dias = 14;

        int idadeEmDias = idadeEmDias(anos, meses, dias);

        System.out.println("Sua idade em dias é igual a: " + idadeEmDias);
    }

   public static int idadeEmDias(int anos, int meses, int dias) {
        return (anos * 365) + (meses * 30) + dias;
    }
 } */
