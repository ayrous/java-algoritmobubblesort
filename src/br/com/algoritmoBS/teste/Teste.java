package br.com.algoritmoBS.teste;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		List<Double> alturas = new ArrayList<>();
		alturas.add(1.2);
		alturas.add(1.8);
		alturas.add(1.5);
		alturas.add(1.6);
		alturas.add(1.4);
		alturas.add(1.7);
		
		Double troca = 0.0;
		
		for(int i = 0; i < alturas.size(); i++) {
			for(int j = 0; j < alturas.size()-1; j++) {
				if(alturas.get(j).compareTo(alturas.get(j+1)) > 0) {
					troca = alturas.get(j);
					alturas.set(j,alturas.get(j+1));
					alturas.set(j+1, troca);
				}
			}
		}
	
	for(Double d : alturas) {
		System.out.println(d);
	}
	
	}

}
