package br.com.algoritmoBS.teste;

import br.com.algoritmoBS.modelo.BuscaBS;

public class BuscaBSTesteDrive {
	
	public static void main(String[] args) {
		
		Double alturas[] = {1.7, 1.3, 1.5, 1.2, 1.8, 1.6};
		
		BuscaBS buscaBS = new BuscaBS();
		alturas = buscaBS.bubbleSort(alturas);
		
		for(int i = 0; i < alturas.length; i++) {
			System.out.println(alturas[i]);
		}
	}
}
