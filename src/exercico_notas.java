import java.util.Scanner;

public class exercico_notas {

    public static String mediaAproveitamento(double[] input) {
        // Extraímos as notas do array
        double N1 = input[0];
        double N2 = input[1];
        double N3 = input[2];
        double mediaExercicios = input[3];

        // Calcula a média de aproveitamento usando a fórmula fornecida
        double mediaAproveitamento = (N1 + N2 * 2 + N3 * 3 + mediaExercicios) / 7;

        // Determina o conceito com base na média de aproveitamento
        String conceito;
        if (mediaAproveitamento >= 9.0) {
            conceito = "A";
        } else if (mediaAproveitamento >= 7.5) {
            conceito = "B";
        } else if (mediaAproveitamento >= 6.0) {
            conceito = "C";
        } else {
            conceito = "D";
        }

        return conceito;
    }

    public static void main(String[] args) {
        // Testa a função com exemplos fornecidos
        double[] notas1 = {8.0, 7.0, 8.0, 8.0};
        double[] notas2 = {5.0, 4.3, 8.0, 7.0};

        System.out.println("Conceito do aluno 1: " + mediaAproveitamento(notas1)); // Saída esperada: B
        System.out.println("Conceito do aluno 2: " + mediaAproveitamento(notas2)); // Saída esperada: C
    }
}
