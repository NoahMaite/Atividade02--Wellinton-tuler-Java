// Nayara Pereira Soares
// Exercício 3:
// Entrar via teclado com “N” valores quaisquer. O valor “N” (quantidade de números) será digitado, deve ser positivo e menor que 20.
// Após a digitação dos “N” valores, exibir:
// a. O maior valor;
// b. O menor valor;
// c. A soma dos valores;
// d. A média aritmética dos valores;
// e. A porcentagem de valores positivos;
// f. A porcentagem de valores negativos.

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Digite a quantidade de valores (menor que 20): ");
            n = sc.nextInt();
        } while (n <= 0 || n >= 20);

        int[] valores = new int[n];
        int soma = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        int positivos = 0, negativos = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            valores[i] = sc.nextInt();

            soma += valores[i];

            if (valores[i] > maior) maior = valores[i];
            if (valores[i] < menor) menor = valores[i];

            if (valores[i] > 0) positivos++;
            else if (valores[i] < 0) negativos++;
        }

        double media = soma / (double) n;
        double percPos = positivos * 100.0 / n;
        double percNeg = negativos * 100.0 / n;

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Porcentagem positivos: " + percPos + "%");
        System.out.println("Porcentagem negativos: " + percNeg + "%");

        System.out.print("Deseja executar novamente? (S/N): ");
        char opcao = sc.next().toUpperCase().charAt(0);
        if (opcao == 'S') {
            main(null); 
        } else {
            System.out.println("Programa encerrado.");
        }

        sc.close();
    }
}
