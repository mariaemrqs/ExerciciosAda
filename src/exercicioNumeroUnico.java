public class exercicioNumeroUnico {
        public static int numeroUnico(int[] input) {
            for (int i = 0; i < input.length; i++) {
                boolean unico = true;

                // Verifica se o número atual se repete
                for (int j = 0; j < input.length; j++) {
                    if (i != j && input[i] == input[j]) {
                        unico = false;
                        break;
                    }
                }

                // Se o número não se repete, retorna ele
                if (unico) {
                    return input[i];
                }
            }

            // Se não encontrou nenhum número único, retorna -1
            return -1;
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 2, 5, 5, 5, 4, 4, 10, 10};
            System.out.println(numeroUnico(array));  // Saída: 1
        }
    }


