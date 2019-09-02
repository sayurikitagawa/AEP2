package aula20190902.mais_coleções;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
	
	public static void main(String[] args) {
		List<Integer> listaDeValores = new ArrayList<Integer>();
		listaDeValores.add(10);
		listaDeValores.add(40);
		listaDeValores.add(30);
		listaDeValores.add(20);
		listaDeValores.add(20);
		
		Set<Integer> conjuntoDeValores = new HashSet<Integer>();
		
		for (int índice = 0; índice < listaDeValores.size(); índice++) {
			conjuntoDeValores.add(listaDeValores.get(índice));
			System.out.println(índice + ">> " + listaDeValores.get(índice));
		}
		
		System.out.println("Tamanho da lista...: " + listaDeValores.size());
		System.out.println("Tamanho do conjunto: " + conjuntoDeValores.size());
		
		System.out.println("<< Conteúdo do conjunto >>");
		for (Integer valor : conjuntoDeValores) {
			System.out.println(valor);
		}
		System.out.println("<< Fim do conjunto >>");
		
	}

}




