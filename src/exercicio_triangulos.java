public class exercicio_triangulos {

    public static boolean eUmTriangulo(int[] input) {
        int lado1 = input[0];
        int lado2 = input[1];
        int lado3 = input[2];

        if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado3 + lado1 > lado2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Exemplos fornecidos
        int[] entrada1 = {2, 2, 5};
        int[] entrada2 = {3, 3, 5};

        System.out.println("Entrada: [2, 2, 5] - Saída: " + eUmTriangulo(entrada1));
        System.out.println("Entrada: [3, 3, 5] - Saída: " + eUmTriangulo(entrada2));
    }
}


