import java.util.Scanner;

public class exercicioCondicionaisEOperadores {

    public static int somaAlgarismos(int input) {
        int soma = 0;

        // Verifica se o número é maior que zero
        if (input > 0) {
            // Calcula a soma dos algarismos
            while (input > 0) {
                soma += input % 10; // Adiciona o último algarismo à soma
                input /= 10; // Remove o último algarismo
            }
        } else {
            return -1; // Retorna -1 se o número for menor ou igual a zero
        }

        return soma; // Retorna a soma dos algarismos
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro maior que zero: ");
        int numero = sc.nextInt();

        int resultado = somaAlgarismos(numero);
        System.out.println("A soma dos algarismos é: " + resultado);
    }
}

