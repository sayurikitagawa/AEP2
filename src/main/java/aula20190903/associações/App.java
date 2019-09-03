package aula20190903.associações;

import java.util.ArrayList;
import java.util.List;


public class App {
	
	public static void main(String[] args) {
		Cultivar milho = new Cultivar("Milho");
		Cultivar soja = new Cultivar("Soja");
		Cultivar trigo = new Cultivar("Trigo");
		
		
		Fazenda f1 = new Fazenda("Cerro Azul", 1000.25, 5000000.00);
		f1.adicionarCultivar(milho);

		Fazenda f2 = new Fazenda("Cedro Nobre", 500.00, 1557000.00);
		f2.adicionarCultivar(milho);
		f2.adicionarCultivar(soja);

		Fazenda f3 = new Fazenda("Água Doce", 1000.00, 6550441.33);
		f3.adicionarCultivar(milho);
		f3.adicionarCultivar(soja);
		f3.adicionarCultivar(trigo);
		
		List<Fazenda> fazendas = new ArrayList<Fazenda>();
		fazendas.add(f1);
		fazendas.add(f2);
		fazendas.add(f3);
		fazendas.add(new Fazenda("Testes", 1, 100));
		
		imprimirFazendasNoConsole(fazendas);
		
		f1.getCultivares().get(0).setNome("Milho de Pipoca");
		
		imprimirFazendasNoConsole(fazendas);
	}
	
	public static void imprimirFazendasNoConsole(List<Fazenda> fazendas) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
		for (Fazenda fazenda : fazendas) {
			System.out.println("Fazenda: " + fazenda.getNome());
			for (Cultivar cultivar : fazenda.getCultivares()) {
				System.out.println("  " + cultivar.getNome());
			}
		}
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<");
	}

}
