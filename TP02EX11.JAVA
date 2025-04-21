// Nayara Pereira Soares
// Exercício 11:
// Armazenar seis nomes em uma matriz de ordem 2x3. 
// Após a digitação, apresentar somente os nomes das posições ímpares.

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] nomes = new String[2][3];

        System.out.println("Digite 6 nomes para preencher a matriz 2x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Nome [%d][%d]: ", i, j);
                nomes[i][j] = sc.next();
            }
        }

        System.out.println("Nomes nas posições ímpares:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                int pos = i * 3 + j;
                if (pos % 2 != 0) {
                    System.out.printf("Posição [%d][%d]: %s\n", i, j, nomes[i][j]);
                }
            }
        }

        sc.close();
    }
}
