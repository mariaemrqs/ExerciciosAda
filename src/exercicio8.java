import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Insira um valor para o elemento [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        // Para mostrar a matriz:
        System.out.println("Matriz completa:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t"); // \t insere um espaço maior entre os elementos da matriz
            }
            System.out.println(); // Para inserir uma nova linha após cada linha da matriz
        }

        // Para mostrar os elementos da diagonal principal:
        System.out.print("Elementos da diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    System.out.print(matriz[i][i] + " ");
                }
            }
        }

        // Para somar a diagonal principal:
        int diagonalSoma = 0; // Inicializa a soma da diagonal principal
        for (int i = 0; i < matriz.length; i++) {
            diagonalSoma += matriz[i][i]; // Soma os elementos da diagonal principal
        }
        System.out.println("Soma dos elementos da diagonal: " + diagonalSoma);


        sc.close();

    }
}
