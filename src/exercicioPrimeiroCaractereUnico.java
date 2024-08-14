public class exercicioPrimeiroCaractereUnico {
        public static int primeiroCaractereUnico(String input) {
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                boolean isUnique = true;

                for (int j = 0; j < input.length(); j++) {
                    if (i != j && c == input.charAt(j)) {
                        isUnique = false;
                        break;
                    }
                }

                if (isUnique) {
                    return i;
                }
            }

            return -1; // Se nenhum caractere único for encontrado
        }

        public static void main(String[] args) {
            String palavra = "amor";
            int indice = primeiroCaractereUnico(palavra);
            System.out.println(indice); // Saída esperada: 0
        }
    }


