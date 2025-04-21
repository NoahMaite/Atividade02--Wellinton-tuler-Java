// Nayara Pereira Soares
// Exercício 1:
// Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
// Caso contrário, solicitar novamente apenas o segundo valor.

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2;

        System.out.print("Digite o primeiro valor: ");
        valor1 = sc.nextInt();

        do {
            System.out.print("Digite o segundo valor (maior que o primeiro): ");
            valor2 = sc.nextInt();
            if (valor2 <= valor1) {
                System.out.println("O segundo valor deve ser maior que o primeiro!");
            }
        } while (valor2 <= valor1);

        System.out.println("Valores aceitos: " + valor1 + " e " + valor2);
        sc.close();
    }
}
