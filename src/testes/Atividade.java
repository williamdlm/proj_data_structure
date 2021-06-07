package testes;

public class Atividade {
	public static void main(String[] args) {
		// Testando m�todo de ordena��o
		String[] nomes = adicionarArray(new String[] { "AA", "a", "aab", "AAbei", "Antonio" }, "Abc");
		System.out.println(nomes.length);

		// Imprime os nomes
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}

	}

	// M�todo de ordena��o
	public static String[] ordenar(String[] arrayNomes) {

		// vari�vel para auxiliar na troca dos nomes
		String aux = "";

		for (int i = 0; i < arrayNomes.length; i++) {

			for (int j = 0; j < arrayNomes.length; j++) {
				String nome1 = arrayNomes[i];// string que est� no �ndice i do array.
				String nome2 = arrayNomes[j];// string que est� no �ndice j do array.
				// int menor;
				// int count = 0;

				// A primeira letra do nome2 � maior do que a primeira letra do nome1 ?
				if (nome2.toLowerCase().compareTo(nome1.toLowerCase()) > 0) {
					// utiliza a vari�vel auxiliar e trocar os nomes de posi��o no array.
					aux = nome1;
					arrayNomes[i] = nome2;
					arrayNomes[j] = aux;

				}

			}

		}
		return arrayNomes;
	}

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
}
