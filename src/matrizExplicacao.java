public class MatrizesExplicacao {
    public static void main(String[] args) {
        // Declaração de uma matriz de inteiros 3x4
        int[][] matrizInteiros = new int[3][4];

        // Inicialização de uma matriz de inteiros 2x3
        int[][] matrizNumeros = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Acessando o elemento na segunda linha e terceira coluna
        int elemento = matrizNumeros[1][2];
// Acessando o elemento na segunda linha e terceira coluna
        int elemento = matrizNumeros[1][2];

        // Matriz irregular: arrays de arrays com diferentes tamanhos
        int[][] matrizIrregular = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        //pega numeros de linha da matriz
        System.out.println(matrizIrregular[0].length);

        //[linha][coluna]
        System.out.println(matrizNumeros[1][2]);

    }
}