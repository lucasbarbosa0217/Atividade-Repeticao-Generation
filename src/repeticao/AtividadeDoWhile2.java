package repeticao;

import java.util.Scanner;

public class AtividadeDoWhile2 {
	public static void main(String[] args) {

		/*
		 * Escreva um algoritmo em Java, que leia números inteiros via teclado, até que
		 * o número zero seja digitado. Ao final, mostre na tela a média de todos os
		 * números digitados, que sejam múltiplos de 3. Veja o exemplo abaixo:
		 * 
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		int numero, soma = 0, total = 0;
		float media;

		do {
			System.out.print("Digite um número: ");
			numero = scanner.nextInt();

			if (numero % 3 == 0 && numero != 0) {
				soma += numero;
				total++;
			}

		} while (numero != 0);

		scanner.close();

		if (total != 0) {
			media = (float) soma / total;
			System.out.printf("A média de todos os números múltiplos de 3 é: %.1f", media);
		} else {
			System.out.print("Nenhum número digitado é múltiplo de 3");
		}

	}

}
