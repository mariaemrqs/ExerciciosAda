import java.util.ArrayList;
import java.util.List;

public class exercicioGincana {
    public static String[] substringStr(String[] input) {
        List<String> substrings = new ArrayList<>();

        // Percorre cada palavra no array de entrada
        for (int i = 0; i < input.length; i++) {
            String currentWord = input[i];
            boolean isSubstring = false;

            // Compara a palavra atual com todas as outras palavras no array
            for (int j = 0; j < input.length; j++) {
                // Evita comparar a palavra com ela mesma
                if (i == j) {
                    continue;
                }

                String comparisonWord = input[j];

                // Verifica se a palavra atual é substring da palavra de comparação
                if (comparisonWord.contains(currentWord)) {
                    isSubstring = true;
                    break; // Não precisa continuar se já encontrou uma correspondência
                }
            }

            // Se a palavra atual é uma substring, adiciona à lista de substrings
            if (isSubstring) {
                substrings.add(currentWord);
            }
        }

        // Converte a lista de substrings para um array de Strings e retorna
        return substrings.toArray(new String[0]);
    }

    // Método main para teste
    public static void main(String[] args) {
        String[] entrada = {"as", "mas", "amor", "amoreco"};
        String[] resultado = substringStr(entrada);

        // Imprime o resultado
        for (String palavra : resultado) {
            System.out.println(palavra);
        }
    }
}

