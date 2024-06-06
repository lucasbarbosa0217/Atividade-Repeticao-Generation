package repeticao;

import java.util.Scanner;

public class AtividadeWhile2 {
	public static void main(String[] args) {

		/*
		 * Escreva um algoritmo em Java, que leia a idade de várias pessoas (números
		 * inteiros), via teclado e mostre na tela o total de pessoas cuja idade seja
		 * menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. A
		 * leitura dos dados deve ser finalizada ao digitar uma idade negativa. Veja o
		 * exemplo abaixo
		 */

		Scanner scanner = new Scanner(System.in);
		int idade = 0, anos21 = 0, anos50 = 0;
	

		while(idade >= 0) {
			System.out.print("Digite uma idade: ");
			idade = scanner.nextInt();

			if (idade <= 21 && idade >= 0) {
				anos21++;
			}
			
			if(idade >= 50) {
				anos50++;
			}

		} 

		scanner.close();

		System.out.printf("Total de pessoas menores de 21 anos: %d",anos21);
		System.out.printf("\nTotal de pessoas maiores de 50 anos: %d",anos50);

	}

}
