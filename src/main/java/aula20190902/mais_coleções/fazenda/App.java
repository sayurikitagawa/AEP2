package aula20190902.mais_coleções.fazenda;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		List<Fazenda> fazendas = new ArrayList<Fazenda>();
		Fazenda f1 = new Fazenda("Cerro Azul", 1000.25, 5000000.00);
		Fazenda f2 = new Fazenda("Cedro Nobre", 500.00, 1557000.00);
		
		fazendas.add(f1);
		fazendas.add(f2);
		fazendas.add(new Fazenda("Água Doce", 1000.00, 6550441.33));
		fazendas.add(new Fazenda("Água Fria", 852.00, 3550441.12));
		fazendas.add(new Fazenda("Água Quente", 439.00, 550441.33));
		
		listarFazendasNoConsole(fazendas);
		
		f1.setValorDeMercado(5210000.00);
		fazendas.get(2).setValorDeMercado(7000000.00);

		listarFazendasNoConsole(fazendas);
	}
	public static void listarFazendasNoConsole(List<Fazenda> fazendas) {
		System.out.println(">>>>>>>>>>>>");
		for (Fazenda f : fazendas) {
			System.out.println(f.getNome() + " " + f.getAreaEmHectares() + " " + f.getValorDeMercado());
		}
	}

}
