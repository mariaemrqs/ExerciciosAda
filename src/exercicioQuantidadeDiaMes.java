import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class exercicioQuantidadeDiaMes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do Mes: ");
        String mes = sc.nextLine().toUpperCase();

        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();

        boolean resultadoAno = bissexto(ano);




        sc.close();
}

public enum MesAno{
    JANEIRO(31), FEVEREIRO(28), MARCO(30), ABRIL(30), MAIO(31), JUNHO(30), JULHO(31), AGOSTO(31), SETEMBRO(30), OUTUBRO(31), NOVEMBRO(30), DEZEMBRO(31);

    private final QTD_DIAS;
    MesAno(int i) {
        this.QTD_DIAS = i;
    }
}

public String qtdDeDias(String mes, int ano){

        if(bissexto && mes.equals(MesAno.FEVEREIRO)){
            return 29;
        }

        else{
            return mes.equals(M);
        }
}

public static boolean bissexto(int ano){
        return ((ano %4 == 0) && (ano % 100 != 0 || (ano % 400 == 0)));
}

}