import java.util.Scanner;

public class Questao1 {
    //Gustavo Oliveira da Silva
    //Questão 1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int impares = 0, pares = 0;

        System.out.println("Informe 10 numeros inteiros");

        for(int i=0;i<numeros.length;i++) {
            System.out.println("Informe o numero " + (i+1) + ":");
            numeros[i] = scanner.nextInt();

            if(numeros[i] %2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Resultado");
        System.out.println("Numeros pares informados: " + pares);
        System.out.println("Numeros impares informados: " + impares);
    }
}
