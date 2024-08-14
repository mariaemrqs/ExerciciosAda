public class exercicioConcursoNacional {
        public static String[] soletrandoInvertidoStr(String input) {
            // Cria um array para armazenar os caracteres invertidos
            String[] resultado = new String[input.length()];

            // Itera sobre a string de trás para frente e armazena cada caractere no array
            for (int i = 0; i < input.length(); i++) {
                resultado[i] = String.valueOf(input.charAt(input.length() - 1 - i));
            }

            return resultado;
        }

        public static void main(String[] args) {
            String palavra = "amor";
            String[] resultado = soletrandoInvertidoStr(palavra);

            // Exibe o array de caracteres invertidos
            for (String letra : resultado) {
                System.out.print(letra + " ");
            }
            // Saída esperada: ["r", "o", "m", "a"]
        }
    }


