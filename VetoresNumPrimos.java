import java.util.Scanner;

public class VetoresNumPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[9];

        System.out.println("Digite 9 números inteiros:");
        for (int i = 0; i < 9; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        // Verifica e mostra os números primos
        System.out.println("\nNúmeros primos e suas posições:");
        for (int i = 0; i < 9; i++) {
            int num = vetor[i];
            boolean primo = true;

            // Números menores ou iguais a 1 não são primos
            if (num <= 1) {
                primo = false;
            } else {
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        primo = false;
                        break;
                    }
                }
            }
            
            if (primo) {
                System.out.println("Número " + num + " na posição " + i);
            }
        }

        sc.close();
    }
}
