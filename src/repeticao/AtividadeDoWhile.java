package repeticao;

import java.util.Scanner;

public class AtividadeDoWhile {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numero, soma = 0, total = 0;
		float media;
		
		do {
			System.out.print("Digite um número: ");
			numero = scanner.nextInt();
			
			if(numero %3 == 0 && numero != 0) {
				soma += numero;
				total++;
			}
			
		}while(numero != 0);
		
		
		if(total != 0) {
			media = (float) soma/total;
			System.out.printf("A média de todos os números múltiplos de 3 é: %.1f", media);
		}else {
			System.out.print("Nenhum número digitado é múltiplo de 3");
		}
	
		
		
		
	}

}
