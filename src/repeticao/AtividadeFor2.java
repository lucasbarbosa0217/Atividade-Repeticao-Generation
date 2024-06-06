package repeticao;

import java.util.Scanner;

public class AtividadeFor2 {
	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o
		 * primeiro número deve ser menor do que o segundo número. Caso contrário, deve
		 * ser exibida uma mensagem na tela informando que o intervalo é inválido e sair
		 * do programa. No intervalo informado, mostre na tela todes os números que são
		 * múltiplos de 3 e 5. Veja os exemplos abaixo:
		 */

		Scanner scanner = new Scanner(System.in);
		int numero, pares = 0, impares = 0;

		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o %dº número: ", i + 1);
			numero = scanner.nextInt();

			if (numero % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		
		scanner.close();
		System.out.printf("Total de números pares: %d", pares);
		System.out.printf("%nTotal de números ímpares: %d", impares);
	}
}
