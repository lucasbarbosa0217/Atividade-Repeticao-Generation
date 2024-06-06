package repeticao;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeWhile {
	public static void main(String[] args) {
		/*
		 * Uma empresa desenvolveu uma pesquisa interna para conhecer os colaboradores
		 * da área de Desenvolvimento e precisam de um sistema para analisar os dados.
		 * Escreva um algoritmo em Java, que leia via teclado as seguintes informações
		 * de cada colaborador:
		 * 
		 */

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);

		int idade, idGenero, idCargo;
		char continua = 's';
		int qtdBackend = 0, mulheresFront = 0, homensMobile40 = 0, nbFullstack30 = 0, total = 0;
		float mediaIdade = 0.0f;

		while (continua != 'n') {

			if (total == 0) {
				System.out.printf("Digite a idade:");
			} else {
				System.out.printf("\n\n________________________________________________________________\n");
				System.out.printf("Digite a idade:");

			}
			idade = scanner.nextInt();

			System.out.printf("____________________\n");
			System.out.printf("| %-2s | %-13s|%n", "id", "idGenero");
			System.out.printf("|____|______________|\n");
			System.out.printf("| %-2d | %-13s|%n", 1, "Mulher Cis");
			System.out.printf("| %-2d | %-13s|%n", 2, "Homem Cis");
			System.out.printf("| %-2d | %-13s|%n", 3, "Não Binário");
			System.out.printf("| %-2d | %-13s|%n", 4, "Mulher Trans");
			System.out.printf("| %-2d | %-13s|%n", 5, "Homem Trans");
			System.out.printf("| %-2d | %-13s|%n", 6, "Outros");
			System.out.printf("|____|______________|\n");

			System.out.print("Qual o id da identidade de Gênero? ");
			idGenero = scanner.nextInt();

			System.out.printf("____________________\n");
			System.out.printf("| %-2s | %-13s|%n", "id", "Area");
			System.out.printf("|____|______________|\n");
			System.out.printf("| %-2d | %-13s|%n", 1, "Backend");
			System.out.printf("| %-2d | %-13s|%n", 2, "Frontend");
			System.out.printf("| %-2d | %-13s|%n", 3, "Mobile");
			System.out.printf("| %-2d | %-13s|%n", 4, "FullStack");
			System.out.printf("|____|______________|\n");
			
			System.out.print("Qual o id do cargo? ");
			idCargo = scanner.nextInt();

			if (idCargo == 1) qtdBackend++;
			if ((idGenero == 1 || idGenero == 4) && idCargo == 2) mulheresFront++;
			if ((idGenero == 2 || idGenero == 5) && idCargo == 3 && idade > 40) homensMobile40++;
			if (idGenero == 3 && idCargo == 4 && idade < 30) nbFullstack30++;
			total++;
			mediaIdade += idade;

			System.out.println("\n\nDeseja adicionar outra pessoa? n = Não, s = Sim");
			continua = Character.toLowerCase(scanner.next().charAt(0));
		}
		
		scanner.close();

		mediaIdade = (float) mediaIdade / total;
		
		System.out.printf("\n\n________________________________________________________________\n");

		System.out.printf("Total de pessoas desenvolvedoras Backend: %d\n", qtdBackend);
		System.out.printf("Total de Mulheres Cis e Trans desenvolvedoras Frontend: %d\n", mulheresFront);
		System.out.printf("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: %d\n",
				homensMobile40);
		System.out.printf("Total de Não Bináries desenvolvedores Fullstack menores de 30 anos: %d\n", nbFullstack30);
		System.out.printf("O número total de pessoas que responderam à pesquisa: %d\n", total);
		System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f", mediaIdade);

	}
}
