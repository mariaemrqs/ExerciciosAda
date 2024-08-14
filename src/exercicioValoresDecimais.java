public class exercicioValoresDecimais {
        public static boolean elementosRepetidos(double[] input) {
            // Loop através do array para comparar cada elemento com os demais
            for (int i = 0; i < input.length; i++) {
                for (int j = i + 1; j < input.length; j++) {
                    // Se encontrar dois elementos iguais, retorna true
                    if (input[i] == input[j]) {
                        return true;
                    }
                }
            }
            // Se nenhum elemento se repetir, retorna false
            return false;
        }
    }


