import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class exercicioNumeroMes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número de 1 a 12: ");

        int numero = sc.nextInt();

        String mes = (numero ==1) ? "Janeiro" : (numero ==2) ? "Fevereiro" : (numero == 3) ? "Marco" : (numero ==4) ? "Abril" : (numero == 5) ? "Maio" : (numero ==6) ? "Junho" : (numero ==7) ? "Julho" : (numero ==8) ? "Agosto" : (numero ==9) ? "Setembro" : (numero == 10) ? "Outubro" : (numero == 11) ? "Novembro" : (numero == 12) ? "Dezembro" : "Número inválido; insira um numero de 1 a 12.";

        System.out.print("O mes é: " + mes);
        sc.close();
    }
}