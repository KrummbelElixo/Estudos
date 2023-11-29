import java.util.Scanner;

public class Questao3 {
    //Gustavo Oliveira da Silva
    //Questão 3
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Defina a matriz (3x3)");
        organizarMatriz(matriz, scanner);
        System.out.println("Visualize a matriz");
        visualizarMatriz(matriz);
        somandoDiagonalPrincipal(matriz);
    }

    public static void organizarMatriz(int[][] matriz, Scanner scanner) {
        for(int i=0;i<matriz.length;i++) {
            for(int j=0;j<matriz[i].length;j++) {
                System.out.println("Defina a linha " + (i+1) + " coluna " + (j+1) + ":");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static void visualizarMatriz(int[][] matriz) {
        for(int[] i:matriz) {
            for (int j: i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void somandoDiagonalPrincipal(int[][] matriz) {
        int somaDiagonal = 0;
        int[] somar = new int[]{0, 1, 2};
        for(int i=0;i<matriz.length;i++) {
            for(int j=0;j<matriz[i].length;j++) {
                if(j == somar[i]) {
                    somaDiagonal += matriz[i][j];
                }
            }
        }

        System.out.println("Soma da diagonal principal: " + somaDiagonal);
    }
}
