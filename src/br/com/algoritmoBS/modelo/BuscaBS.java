package br.com.algoritmoBS.modelo;

public class BuscaBS {

	public Double[] bubbleSort(Double[] alturas) {
		long tempoinicial = System.currentTimeMillis();
		for (int i = alturas.length; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				if (alturas[j - 1] > alturas[j]) {
					Double aux = alturas[j];
					alturas[j] = alturas[j - 1];
					alturas[j - 1] = aux;
				}
			}
		}
		long tempofinal = System.currentTimeMillis();
		long tempototal = tempofinal - tempoinicial;
		System.out.println("Tempo de Processamento de BubbleSort: " + tempototal + "ms");
		return alturas;
	}

}
