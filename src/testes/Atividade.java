package testes;

import java.util.Scanner;

public class Atividade {
	public static void main(String[] args) {
		// Testando método de inserção
		// String[] nomes = adicionarArray(new String[] { "AA", "a", "aab", "AAbei",
		// "Antonio" }, "Abc");

		// Testando método de exclusão
		// String[] nomes = excluirArray(new String[] { "Will", "Joao", "Marc", "Lari",
		// "Altair" }, "Marc");

		// Testando método de alteração
		// String[] nomes = alterarArray(new String[] { "Will", "Joao", "Marc", "Lari",
		// "Altair" }, "Will", "William");

		// Imprime os nomes
		// for (int i = 0; i < nomes.length; i++) {
		// System.out.println(nomes[i]);
		// }

		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira uma lista de nomes separado por virgula e um espaço:");
		String nomes = entrada.nextLine();
		System.out.println("");
		String[] arrayDeNomes = nomes.split(", ");
		int input;
do {
		System.out.println("##### MENU #####" + "\n1: Para Listar os nomes" + "\n2: Para Adicionar um nome"
				+ "\n3: Para Alterar um nome" + "\n4: Para Excluir um nome" + "\n0: Para sair");

		input = entrada.nextInt();

		switch (input) {
		case 0:{
			System.out.println("Programa finalizado");
			break;
		}
		case 1: {
			System.out.println("");
			System.out.println("##### LISTAR #####");
			arrayDeNomes = ordenar(arrayDeNomes);
			for (String string : arrayDeNomes) {
				System.out.println(string);
			}
			System.out.println("");
			break;
		}
		case 2: {
			System.out.println("");
			System.out.println("##### INSERIR #####");
			System.out.println("Insira o nome que deseja adicionar:");
			String newName = entrada.next();
			arrayDeNomes = adicionarArray(arrayDeNomes, newName);
			System.out.println("");
			break;
		}
		case 3: {
			System.out.println("");
			System.out.println("##### Alterar #####");
			System.out.println("Digite o nome que deseja alterar:");
			String oldName = entrada.next();
			System.out.println("Digite o novo nome:");
			String newName = entrada.next();
			arrayDeNomes = alterarArray(arrayDeNomes, oldName, newName);
			System.out.println("");
			break;
		}
		case 4: {
			System.out.println("");
			System.out.println("##### Excluir #####");
			System.out.println("Digite o nome que deseja excluir:");
			String excName = entrada.next();
			arrayDeNomes = excluirArray(arrayDeNomes, excName);
			System.out.println("");
			break;
			
		}

		}
	}while(input != 0);

	}

	// Método de ordenação
	public static String[] ordenar(String[] arrayNomes) {

		// variável para auxiliar na troca dos nomes
		String aux = "";

		for (int i = 0; i < arrayNomes.length; i++) {

			for (int j = 0; j < arrayNomes.length; j++) {
				String nome1 = arrayNomes[i];// string que está no índice i do array.
				String nome2 = arrayNomes[j];// string que está no índice j do array.
				// int menor;
				// int count = 0;

				// A string do nome2 é maior do que a string do nome1 ?
				if (nome2.toLowerCase().compareTo(nome1.toLowerCase()) > 0) {
					// utiliza a variável auxiliar e trocar os nomes de posição no array.
					aux = nome1;
					arrayNomes[i] = nome2;
					arrayNomes[j] = aux;

				}

			}

		}
		return arrayNomes;
	}

	// Metodo de inclusão
	public static String[] adicionarArray(String[] arrayNomes, String newName) {
		String[] newArray = new String[arrayNomes.length + 1];
		for (int i = 0; i <= arrayNomes.length; i++) {
			if (i == arrayNomes.length) {
				newArray[i] = newName;
				newArray = ordenar(newArray);
			} else {
				newArray[i] = arrayNomes[i];
			}
		}
		return newArray;
	}

	// Metodo de exclusão
	public static String[] excluirArray(String[] arrayNomes, String nameDeleted) {
		String[] newArray = new String[arrayNomes.length - 1];
		String aux = "";
		for (int i = 0; i <= arrayNomes.length - 2; i++) {
			if (!arrayNomes[i].equals(nameDeleted)) {
				newArray[i] = arrayNomes[i];
			} else {
				aux = newArray[i];
				newArray[i] = arrayNomes[arrayNomes.length - 1];
				arrayNomes[arrayNomes.length - 1] = aux;

			}
			if (i == arrayNomes.length - 2) {
				newArray = ordenar(newArray);
			}

		}
		return newArray;
	}

	// Metodo de alteração
	public static String[] alterarArray(String[] arrayNomes, String alteredName, String newName) {
		String[] newArray = new String[arrayNomes.length];
		for (int i = 0; i <= arrayNomes.length - 1; i++) {
			if (arrayNomes[i].equals(alteredName)) {
				arrayNomes[i] = newName;
			}
			newArray[i] = arrayNomes[i];
			if (i == arrayNomes.length - 1) {
				newArray = ordenar(newArray);
			}

		}
		return newArray;
	}

}
