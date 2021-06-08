package testes;

public class Atividade {
	public static void main(String[] args) {
		// Testando método de inserção
		// String[] nomes = adicionarArray(new String[] { "AA", "a", "aab", "AAbei",
		// "Antonio" }, "Abc");

		// Testando método de exclusão
		// String[] nomes = excluirArray(new String[] { "Will", "Joao", "Marc", "Lari",
		// "Altair" }, "Marc");

		// Testando método de alteração
		String[] nomes = alterarArray(new String[] { "Will", "Joao", "Marc", "Lari", "Altair" }, "Will", "William");

		// Imprime os nomes
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}

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
			if (arrayNomes[i] != nameDeleted) {
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
			if (arrayNomes[i] == alteredName) {
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
