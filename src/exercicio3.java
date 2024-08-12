import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o mês do seu nascimento (1-12)? ");
        int mes = sc.nextInt();

        System.out.print("Qual o dia do seu nascimento (1-31)? ");
        int dia = sc.nextInt();

        String signo = (mes == 1)  ? ((dia <= 19) ? "Capricórnio" : "Aquário") :
                (mes == 2)  ? ((dia <= 18) ? "Aquário" : "Peixes") :
                        (mes == 3)  ? ((dia <= 20) ? "Peixes" : "Áries") :
                                (mes == 4)  ? ((dia <= 19) ? "Áries" : "Touro") :
                                        (mes == 5)  ? ((dia <= 20) ? "Touro" : "Gêmeos") :
                                                (mes == 6)  ? ((dia <= 20) ? "Gêmeos" : "Câncer") :
                                                        (mes == 7)  ? ((dia <= 22) ? "Câncer" : "Leão") :
                                                                (mes == 8)  ? ((dia <= 22) ? "Leão" : "Virgem") :
                                                                        (mes == 9)  ? ((dia <= 22) ? "Virgem" : "Libra") :
                                                                                (mes == 10) ? ((dia <= 22) ? "Libra" : "Escorpião") :
                                                                                        (mes == 11) ? ((dia <= 21) ? "Escorpião" : "Sagitário") :
                                                                                                (mes == 12) ? ((dia <= 21) ? "Sagitário" : "Capricórnio") :
                                                                                                        "Data inválida";

        System.out.printf("Seu signo é: %s%n", signo);

        sc.close();
    }
}