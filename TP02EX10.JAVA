// Nayara Pereira Soares
// Exercício 10:
// Armazenar seis valores em uma matriz de ordem 2x3. 
// Após a digitação, apresentar somente os valores das posições pares.

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[2][3];

        System.out.println("Digite os valores da matriz 2x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Valores nas posições pares:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                int pos = i * 3 + j; // posição linear
                if (pos % 2 == 0) {
                    System.out.printf("Posição [%d][%d]: %d\n", i, j, matriz[i][j]);
                }
            }
        }

        sc.close();
    }
}
