package aula20190819.veiculo;

public class App {
	
	public static void main(String[] args) {
		Veiculo meuChevette = new Veiculo(-36.00);
		
		meuChevette.abastecer(200.00);
		
		meuChevette.ligar(); // -0.1 litro
		meuChevette.acelerar(); //-0.5 litro
		meuChevette.acelerar(); //-0.5 litro
		meuChevette.acelerar(); //-0.5 litro
		//meuChevette.acelerar(); //-0.5 litro
		meuChevette.desligar();
		
		System.out.printf("%f",meuChevette.getVolumeNoTanque());
	}

}
