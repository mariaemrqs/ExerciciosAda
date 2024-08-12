import java.util.Scanner;

public class exercicio_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int n = sc.nextInt();

        // Inicializa os dois primeiros números da sequência de Fibonacci
        int a = 0;
        int b = 1;

        System.out.print("Sequência de Fibonacci: ");

        // Sempre imprime o primeiro número da sequência
        System.out.print(a + " ");

        // Gera a sequência de Fibonacci até o número fornecido
        while (b <= n) {
            System.out.print(b + " ");
            int proximo = a + b; // Calcula o próximo número
            a = b;              // Atualiza 'a' para o valor atual de 'b'
            b = proximo;        // Atualiza 'b' para o próximo número
        }

        sc.close();
    }
}
