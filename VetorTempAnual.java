import java.util.Scanner;

public class  VetorTempAnual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] temperaturas = new double[12];
        String[] meses =
          { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("> Digite a temperatura média de " + meses[i] + ": ");
            temperaturas[i] = sc.nextDouble();
        }

        // Maior e menor temperatura
        double maiorTemp = temperaturas[0];
        int mesMaior = 0;

        double menorTemp = temperaturas[0];
        int mesMenor = 0;

        // Comparando para encontrar maior e menor
        for (int i = 1; i < 12; i++) {

            if (temperaturas[i] > maiorTemp) {
                maiorTemp = temperaturas[i];
                mesMaior = i;
            }

            if (temperaturas[i] < menorTemp) {
                menorTemp = temperaturas[i];
                mesMenor = i;
            }
        }

        System.out.println("\nMaior temperatura: " + maiorTemp + "°C em " + meses[mesMaior]);
        System.out.println("Menor temperatura: " + menorTemp + "°C em " + meses[mesMenor]);

        sc.close();
    }
}

