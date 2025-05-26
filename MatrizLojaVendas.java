import java.util.Scanner;

public class MatrizLojaVendas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] vendas = new double[12][4];
        String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", 
                            "Maio", "Junho", "Julho", "Agosto", 
                            "Setembro", "Outubro", "Novembro", "Dezembro"};

        for (int i = 0; i < 12; i++) {
            System.out.println("Digite as vendas para o mês de " + meses[i] + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("  Semana " + (j + 1) + ": R$ ");
                vendas[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        double totalAno = 0;
  
        System.out.println("<<<< Total de vendas por mês >>>>");

        for (int i = 0; i < 12; i++) {

            double totalMes = 0;
            for (int j = 0; j < 4; j++) {
                totalMes += vendas[i][j];
            }

            System.out.println(meses[i] + ": R$ " + totalMes);
            totalAno += totalMes;
        }

        System.out.println();

        System.out.println("<<<< Total de vendas por semana (ano todo) >>>>");

        for (int j = 0; j < 4; j++) {
            double totalSemana = 0;
            for (int i = 0; i < 12; i++) {
                totalSemana += vendas[i][j];
            }
            System.out.println(" - Semana " + (j + 1) + ": R$ " + totalSemana);
        }

        System.out.println();

       
        System.out.println("<<<< Total geral de vendas >>>>");
        System.out.println(" - Total vendido no ano: R$ " + totalAno);

        sc.close();
    }
}
