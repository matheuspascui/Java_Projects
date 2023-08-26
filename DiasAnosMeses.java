import java.util.Scanner;

public class DiasAnosMeses {
    public static void main(String args[]) {
        int idadeEmDias;
        int qtdeMeses, qtdeAnos, qtdeDias;
        final int ANO = 365;
        System.out.println("Olá, neste programa, informe sua idade em dias e converteremos para dias, meses e anos.");
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua idade em dias: ");
        idadeEmDias = teclado.nextInt();
        qtdeAnos = idadeEmDias / ANO;
        qtdeMeses = (idadeEmDias % ANO) / 30;
        qtdeDias = (idadeEmDias % ANO) % 30;
        
        System.out.println("Seus Anos: " + qtdeAnos);
        System.out.println("Seus Meses: " + qtdeMeses);
        System.out.println("Seus Dias: " + qtdeDias);

    }
}