// Nayara Pereira Soares
// Exercício 7:
// Armazenar seis valores em uma matriz de ordem 2x3. 
// Após a digitação, multiplicar todos os elementos da matriz por 5 e apresentar a matriz resultante.

import java.util.Scanner;

public class Exercicio7 {
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

        System.out.println("Matriz multiplicada por 5:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((matriz[i][j] * 5) + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
