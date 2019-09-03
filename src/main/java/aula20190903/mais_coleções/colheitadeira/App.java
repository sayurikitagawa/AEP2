package aula20190903.mais_coleções.colheitadeira;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Colheitadeira> colheitadeiras = new ArrayList<Colheitadeira>();
		colheitadeiras.add(new Colheitadeira("225-ABC", 200, 5000, "Gertrudes"));
		colheitadeiras.add(new Colheitadeira("111-ABC", 250, 6550, "Genoveva"));
		colheitadeiras.add(new Colheitadeira("212-SDF", 125, 2225, "Gerovalda"));
		colheitadeiras.add(new Colheitadeira("442-XXX", 210, 6000));
		colheitadeiras.add(new Colheitadeira("555-ZZZ", 250, 6000));

		for (Colheitadeira colheitadeira : colheitadeiras) {
			if (colheitadeira.getApelidoCarinhoso() != null) {
				System.out.println(colheitadeira.getApelidoCarinhoso() + " " 
						+ colheitadeira.getNumeroDeSerie() + " "
						+ colheitadeira.getCapacidadeDeCargaEmKilos() + " "
						+ colheitadeira.getCapacidadeDoTanqueEmLitros());
			}
		}

	}

}
