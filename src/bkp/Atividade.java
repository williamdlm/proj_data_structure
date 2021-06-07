package bkp;

public class Atividade {
	public static void main(String[] args) {
		// Testando método de ordenação
		String[] nomes = adicionarArray(new String[] { "Zildo", "Alicia", "Aline", "Alura", "Alitia" }, "Vitor");
		System.out.println(nomes.length);

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
				int menor;
				int count = 0;

				// A primeira letra do nome2 é maior do que a primeira letra do nome1 ?
				if (nome2.charAt(0) > nome1.charAt(0)) {
					// utiliza a variável auxiliar e trocar os nomes de posição no array.
					aux = nome1;
					arrayNomes[i] = nome2;
					arrayNomes[j] = aux;

					// A primeira letra do nome2 é igual a nome1?
				} else if (nome2.charAt(0) == nome1.charAt(0)) {
					if (nome1.length() < nome2.length() || nome1.length() == nome2.length()) {
						menor = nome1.length() - 1;
					} else {
						menor = nome2.length() - 1;
					}
					do {

						count++;
						if (nome2.charAt(0) > nome1.charAt(0)) {
							aux = nome1;
							arrayNomes[i] = nome2;
							arrayNomes[j] = aux;
						}
					} while (nome1.charAt(count) == nome2.charAt(count) && count < menor);
				}

			}

		}
		return arrayNomes;
	}
	
	
	public static String[] adicionarArray(String[] arrayNomes, String newName) {
		String[] newArray = new String[arrayNomes.length + 1];
		for (int i = 0; i <= arrayNomes.length ; i++) {
			if(i == arrayNomes.length) {
				newArray[i] = newName;
				newArray = ordenar(newArray);
			}else {
			newArray[i] = arrayNomes[i];
			}
		}
		return newArray;
	}
}
