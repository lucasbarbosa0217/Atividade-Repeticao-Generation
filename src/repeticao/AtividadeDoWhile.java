package repeticao;

import java.util.Scanner;

public class AtividadeDoWhile {
	public static void main(String[] args) {

		/*
		 * Escreva um algoritmo em Java, que leia números inteiros via teclado, até que
		 * o número zero seja digitado. Ao final, mostre na tela a soma de todos os
		 * números digitados, que sejam positivos. Veja o exemplo abaixo
		 */

		Scanner scanner = new Scanner(System.in);
		int numero, soma = 0;

		do {
			System.out.print("Digite um número: ");
			numero = scanner.nextInt();

			if (numero > 0) {
				soma += numero;
			}

		} while (numero != 0);

		scanner.close();


			System.out.printf("A soma de todos os números positivos é: %d", soma);
	

	}

}
