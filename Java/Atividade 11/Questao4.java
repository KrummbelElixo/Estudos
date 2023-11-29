import java.util.Scanner;

public class Questao4 {
    //Gustavo Oliveira da Silva
    //Questão 4
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Defina a matriz:");
        System.out.println("Números pares se tornarão 0");
        System.out.println("Números impares se tornarão 1");
        for(int i = 0; i < matriz.length ; i++) {
            for(int j = 0; j < matriz.length; j++) {
                System.out.println("Linha " + (i+1) + " Coluna " + (j+1) + ":");
                matriz[i][j] = scanner.nextInt();

                if(matriz[i][j] % 2 == 0) {
                    matriz[i][j] = 0;
                } else {
                    matriz[i][j] = 1;
                }
            }
        }

        System.out.println("Resultado:");
        for (int[] x:matriz) {
            for(int y: x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}