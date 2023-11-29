import java.util.Scanner;

public class Questao2 {
    //Gustavo Oliveira da Silva
    //Questão 2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operacao = 0;

        System.out.println("Soma entre duas matrizes");
        System.out.print("Defina a quantidade de linha:");
        int ln = scanner.nextInt();
        System.out.print("Defina a quantidade de colunas:");
        int col = scanner.nextInt();

        int[][] matriz0 = new int[ln][col];
        int[][] matriz1 = new int[ln][col];
        System.out.println("Defina a primeira matriz:");
        organizarMatriz(matriz0, scanner, operacao);
        System.out.println("Defina a segunda matriz:");
        organizarMatriz(matriz1, scanner, (operacao+1));
        System.out.println("Resultado da soma:");
        somarMatrizes(matriz0, matriz1, ln, col);
    }

    public static void organizarMatriz(int[][] matriz, Scanner scanner, int operacao) {
        for(int i=0;i<matriz.length;i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Informe o valor da linha " + (i + 1) + " coluna " + (j + 1));
                matriz[i][j] = scanner.nextInt();
            }
        }
        if(operacao == 0) {
            System.out.println("Matriz 1:");
        } else {
            System.out.println("Matriz 2:");
        }
        for (int[] e:matriz) {
            for (int b: e) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }

    public static void somarMatrizes(int[][] matriz0, int[][]matriz1, int ln, int col) {
        for(int i=0;i<ln;i++) {
            for(int j=0;j<col;j++) {
                matriz0[i][j] = matriz0[i][j] + matriz1[i][j];
            }
        }

        for(int[] e:matriz0) {
            for (int b: e) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
