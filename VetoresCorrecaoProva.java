import java.util.Scanner;

public class VetoresCorrecaoProva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] gabarito = new char[8];
        int totalAprovados = 0;

        // Lendo o gabarito da prova
        System.out.println("> Digite o gabarito da prova (respostas de A a E):");
        for (int i = 0; i < gabarito.length; i++) {
            System.out.print("Questão " + (i + 1) + ": ");
            gabarito[i] = sc.next().toUpperCase().charAt(0);
        }

        // Corrigindo a prova de 10 alunos
        for (int aluno = 1; aluno <= 10; aluno++) {
            System.out.print("\n> Número do aluno " + aluno + ": ");
            int numeroAluno = sc.nextInt();

            char[] respostas = new char[8];
            System.out.println("> Digite as respostas do aluno (A a E):");

            for (int i = 0; i < 8; i++) {
                System.out.print("Questão " + (i + 1) + ": ");
                respostas[i] = sc.next().toUpperCase().charAt(0);
            }

            // Correção
            int nota = 0;
            for (int i = 0; i < 8; i++) {
                if (respostas[i] == gabarito[i]) {
                    nota++;
                }
            }

            System.out.println("Aluno " + numeroAluno + " tirou nota: " + nota);

        
            if (nota >= 6) {
                totalAprovados++;
            }
        }

        double porcentagem = (totalAprovados / 10.0) * 100;
        System.out.printf("\nPorcentagem de aprovação: %.1f%%\n", porcentagem);

        sc.close();
    }
}
