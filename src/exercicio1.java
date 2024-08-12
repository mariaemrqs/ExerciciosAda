import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class exercicio1 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um numero positivo: ");

    int num = sc.nextInt();

    int soma = calcularSomaAntecessores(num);
    System.out.println("A soma de " + num + " com todos os seus antecessores positivos é " + soma);

    sc.close();
    }

    // Método para calcular a soma de um número com todos os seus antecessores positivos
    public static int calcularSomaAntecessores(int n) {
        int soma = 0;
        for (int i = n; i > 0; i--) {
            soma += i;
        }
        return soma;
    }
}