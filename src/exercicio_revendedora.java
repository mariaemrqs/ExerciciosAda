public class exercicio_revendedora {
    public static double valorProdutoFinal(double[] input) {
        double valorProduto = input[0];
        double estado = input[1];
        double valorFinal;

        if (estado == 1.0) {
            valorFinal = valorProduto * 0.07 + valorProduto;
        } else if (estado == 2.0) {
            valorFinal = valorProduto * 0.12 + valorProduto;
        } else if (estado == 3.0) {
            valorFinal = valorProduto * 0.15 + valorProduto;
        } else {
            return -1.0;
        }

        // Arredondamento para 4 casas decimais
        valorFinal = Math.round(valorFinal * 10000.0) / 10000.0;

        return valorFinal;
    }

    public static void main(String[] args) {
        // Exemplos de teste
        double[] input1 = {250.10, 1.0};
        double[] input2 = {220.50, 3.0};

        System.out.println("Saída: " + valorProdutoFinal(input1)); // Esperado: 267.6070
        System.out.println("Saída: " + valorProdutoFinal(input2)); // Esperado: 253.5750
    }
}
