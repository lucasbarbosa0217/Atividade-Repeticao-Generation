package repeticao;

import java.util.Scanner;

public class AtividadeFor {
	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o
		 * primeiro número deve ser menor do que o segundo número. Caso contrário, deve
		 * ser exibida uma mensagem na tela informando que o intervalo é inválido e sair
		 * do programa. No intervalo informado, mostre na tela todes os números que são
		 * múltiplos de 3 e 5. Veja os exemplos abaixo:
		 */
		
		Scanner scanner = new Scanner(System.in);

		int primeiroNumero, segundoNumero;

		System.out.print("Digite o primeiro número do intervalo: ");
		primeiroNumero = scanner.nextInt();

		System.out.print("Digite o segundo número do intervalo: ");
		segundoNumero = scanner.nextInt();

		scanner.close();

		if (primeiroNumero >= segundoNumero) {
			System.out.println("Intervalo Inválido!");
			return; // Interrompe a execução do método main para parar o programa
		}

		System.out.printf("No Intervalo entre %d e %d :", primeiroNumero, segundoNumero);

		for (int i = primeiroNumero; i <= segundoNumero; i++) {
			if ((i % 3 == 00 && i % 5 == 0) && i != 0) {
				System.out.printf("\n%d é múltiplo de 3 e 5", i);
			}
		}

	}
}
