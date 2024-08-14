public class exercicioSoletracao {
        public static String[] soletrandoStr(String input) {
            // Cria um array de Strings com o tamanho da palavra de entrada
            String[] resultado = new String[input.length()];

            // Itera sobre cada caractere da palavra e armazena no array
            for (int i = 0; i < input.length(); i++) {
                resultado[i] = String.valueOf(input.charAt(i));
            }

            // Retorna o array contendo os caracteres separados
            return resultado;
        }

        public static void main(String[] args) {
            String palavra = "amor";
            String[] resultado = soletrandoStr(palavra);

            // Exibe o array de caracteres
            for (String letra : resultado) {
                System.out.print(letra + " ");
            }
            // Saída esperada: ["a", "m", "o", "r"]
        }
    }


