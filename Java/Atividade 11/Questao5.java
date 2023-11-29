import java.util.Scanner;

public class Questao5 {
    //Gustavo Oliveira da Silva
    //Questão 5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Notas");
        System.out.println("Informe a quantidade de alunos");
        int qntDeAlunos = scanner.nextInt();

        float[][] notasDosAlunos = new float[qntDeAlunos][4];
        organizarNotas(notasDosAlunos, scanner);
        somandoMedia(notasDosAlunos);
    }

    public static void organizarNotas (float[][] matriz, Scanner scanner) {
        for(int i=0;i<matriz.length;i++) {
            for(int j=0;j<matriz[i].length;j++) {
                    System.out.println("Aluno " + (i+1));
                    System.out.println("Informe a nota do " + (j+1) + "ºbimestre:");
                    matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static void somandoMedia (float[][] matriz) {
        float mediaDasNotas = 0;
        for(int i=0;i<matriz.length;i++) {
            mediaDasNotas = 0;
            for(int j=0;j<matriz[i].length;j++) {
                mediaDasNotas += matriz[i][j];
            }
            System.out.println("Aluno " + (i+1) + ":");
            System.out.println("Média das notas: " + (mediaDasNotas/4));
        }
    }
}
