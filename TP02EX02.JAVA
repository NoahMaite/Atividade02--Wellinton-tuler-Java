// Nayara Pereira Soares
// Exercício 2:
// Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de erro, se necessário.
// Após a digitação, exibir:
// a. O maior valor;
// b. A soma dos valores;
// c. A média aritmética dos valores.

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[10];
        int soma = 0, maior = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            int valor;
            do {
                System.out.print("Digite o " + (i + 1) + "º valor positivo: ");
                valor = sc.nextInt();
                if (valor <= 0) {
                    System.out.println("Valor inválido. Digite um número positivo.");
                }
            } while (valor <= 0);

            valores[i] = valor;
            soma += valor;
            if (valor > maior) {
                maior = valor;
            }
        }

        double media = soma / 10.0;

        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Média: " + media);

        sc.close();
    }
}
