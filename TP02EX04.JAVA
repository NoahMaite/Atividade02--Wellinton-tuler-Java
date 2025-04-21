// Nayara Pereira Soares
// Exercício 4:
// Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela.

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[2][3];

        System.out.println("Digite 6 valores para preencher a matriz 2x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz 2x3:");
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
