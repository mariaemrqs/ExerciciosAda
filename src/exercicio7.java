import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Número de linhas da matriz: ");
        int linhas = sc.nextInt();
        System.out.println("Número de colunas da matriz: ");
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Valor para o elemento [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }
        // Para encontrar o maior elemento na matriz:
        int maiorElemento = matriz[0][0];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] > maiorElemento) {
                    maiorElemento = matriz[i][j];
                }
            }
        }
        System.out.println("O maior elemento da matriz é: " + maiorElemento);

        sc.close();

    }
}
