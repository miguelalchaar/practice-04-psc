import java.util.Scanner;

public class VetoresLojaArtesanato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] precos = new double[10];
        int[] qntdVendida = new int[10];
       
        for (int i = 0; i < precos.length; i++) {
            System.out.print(">> Digite o preço do objeto " + (i + 1) + ": R$ ");
            precos[i] = sc.nextDouble();
        }

        System.out.println("\n");

        for (int i = 0; i < qntdVendida.length; i++) {
            System.out.print(">> Digite a quantidade vendida do objeto " + (i + 1) + ": ");
            qntdVendida[i] = sc.nextInt();
        }

        double valorTotalVendas = 0;
        int maisVendido = 0;

        System.out.println("\n<<<< RELATÓRIO DE VENDAS >>>>");

        for (int i = 0; i < 10; i++) {

            double valorTotalObjeto = precos[i] * qntdVendida[i];

            System.out.println("> Objeto " + (i + 1));
            System.out.println(" - Quantidade vendida: " + qntdVendida[i]);
            System.out.println(" - Preço unitário: R$ " + precos[i]);
            System.out.println(" - Valor total: R$ " + valorTotalObjeto);
            System.out.println();

            valorTotalVendas += valorTotalObjeto;

            if (qntdVendida[i] > qntdVendida[maisVendido]) {
                maisVendido = i;
            }
        }

        double comissao = valorTotalVendas * 0.05;
        double salarioTotal = 545 + comissao;

        System.out.println("<<<<< RESUMO FINAL >>>>>");
        System.out.println("Valor total das vendas: R$ " + valorTotalVendas);
        System.out.println("Comissão do vendedor (5%): R$ " + comissao);
        System.out.println("Salário total do vendedor: R$ " + salarioTotal);

        System.out.println("\nObjeto mais vendido:");
        System.out.println(" - Posição no vetor: " + maisVendido);
        System.out.println(" - Quantidade vendida: " + qntdVendida[maisVendido]);

        sc.close();
    }
}
