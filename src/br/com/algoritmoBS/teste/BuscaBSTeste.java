package br.com.algoritmoBS.teste;

import java.util.ArrayList;
import java.util.List;

public class BuscaBSTeste {

	public static void main(String[] args) {
		List<String> alunos = new ArrayList<>();
		
		alunos.add("thais");
		alunos.add("joao");
		alunos.add("andré");
		alunos.add("pedro");
		alunos.add("bruno");
		
		System.out.println("Antes da ordenação: ");
		for(int i = 0; i < alunos.size(); i++) {
			System.out.println(alunos.get(i));
		}
		
		
		System.out.println("===============");
		
		String troca = "a";
		
		for(int i = 0; i < alunos.size(); i++) {
			for(int j = 0; j < alunos.size()-1; j++) {
				if(alunos.get(j).compareTo(alunos.get(j+1)) > 0) {
					troca = alunos.get(j);
					alunos.set(j, alunos.get(j).replaceAll(alunos.get(j), alunos.get(j+1)));
					alunos.set(j+1, alunos.get(j+1).replaceAll(alunos.get(j+1), troca));
				}
			}
		}
		
		System.out.println("Depois da ordenação: ");
		for(String s : alunos) {
			System.out.println(s);
		}
	}

}
