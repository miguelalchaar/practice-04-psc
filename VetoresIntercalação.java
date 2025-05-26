import java.util.Scanner;

public class VetoresIntercalação {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] X = new int[10];
        int[] Y = new int[10];
        int[] Z = new int[20];

        System.out.println("Digite 10 números para o vetor X:");
        for (int i = 0; i < 10; i++) {
            System.out.print("X[" + i + "] = ");
            X[i] = sc.nextInt();
        }

        System.out.println("\nDigite 10 números para o vetor Y:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Y[" + i + "] = ");
            Y[i] = sc.nextInt();
        }

        // Intercalando os vetores em Z
        for (int i = 0, j = 0; i < 10; i++) {
            Z[j++] = X[i];
            Z[j++] = Y[i];
        }

        // Imprimindo o vetor Z
        System.out.println("\nVetor Z (intercalado):");
        for (int i = 0; i < 20; i++) {
            System.out.print(Z[i] + " ");
        }

        sc.close();
    }
}