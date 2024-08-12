import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número de 1 a 7: ");

        int numero = sc.nextInt();

        String dia = (numero == 1) ? "Domingo" :
                (numero == 2) ? "Segunda-feira" :
                        (numero == 3) ? "Terça-feira" :
                                (numero == 4) ? "Quarta-feira" :
                                        (numero == 5) ? "Quinta-feira" :
                                                (numero == 6) ? "Sexta-feira" :
                                                        (numero == 7) ? "Sábado" :
                                                                "Número inválido. Por favor, insira um número de 1 a 7.";

        System.out.println("O dia correspondente é: " + dia);

        sc.close();
    }
}
