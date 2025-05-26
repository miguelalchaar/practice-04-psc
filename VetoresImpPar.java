import java.util.Scanner;

public class VetoresImpPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[6];
        int somaPar = 0;
        int qtdImpares = 0;

        System.out.println("Digite 6 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("> Número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("\n--------RELATÓRIO--------");

        
        // Números pares e soma
        System.out.println("\nOs números pares são:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println("> Número " + vetor[i] + " na posição " + (i + 1));
                somaPar += vetor[i];
            }
        }
        
        System.out.println("\n>> Soma dos pares = " + somaPar);

        // Números ímpares e contagem
        System.out.println("\n\nOs números ímpares são:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.println("> Número " + vetor[i] + " na posição " + (i + 1));
                qtdImpares++;
            }
        }
        System.out.println("\n>> Quantidade de ímpares = " + qtdImpares);

        sc.close();
    }
}
