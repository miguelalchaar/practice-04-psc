import java.util.Scanner;

public class VetoresPosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorNum = new int[8];
        int[] vetorPositivo = new int[8];
        int[] vetorNegativo = new int[8];
        int contPositivo = 0, contNegativo = 0;
        
        for (int i = 0; i < vetorNum.length; i++) {
            System.out.print("> Número " + (i + 1) + ": ");
            vetorNum[i] = sc.nextInt();

            if (vetorNum[i] >= 0) {
                vetorPositivo[contPositivo] = vetorNum[i];
                contPositivo++;
            } else {
                vetorNegativo[contNegativo] = vetorNum[i];
                contNegativo++;
            }
        }

        System.out.println("---------------------------------------------");
        System.out.print("\nNúmeros positivos: ");
        
        for (int i = 0; i < contPositivo; i++) {
            System.out.print(vetorPositivo[i] + "\t");
        }

        System.out.println("\n---------------------------------------------");
        System.out.print("\nNúmeros negativos: ");

        for (int i = 0; i < contNegativo; i++) {
            System.out.print(vetorNegativo[i] + "\t");
        }

        sc.close();
    }
  }

