// Nayara Pereira Soares
// Exercício 8:
// Armazenar seis valores em uma matriz de ordem 3x2. 
// Após a digitação, multiplicar todos os elementos da matriz por 5 e apresentar a matriz resultante.

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][2];

        System.out.println("Digite os valores da matriz 3x2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz multiplicada por 5:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print((matriz[i][j] * 5) + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
