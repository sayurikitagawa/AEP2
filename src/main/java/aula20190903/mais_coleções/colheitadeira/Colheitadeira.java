package aula20190903.mais_coleções.colheitadeira;

public class Colheitadeira {
	private final String numeroDeSerie;
	private final double capacidadeDoTanqueEmLitros;
	private final double capacidadeDeCargaEmKilos;
	private String apelidoCarinhoso;
	
	public Colheitadeira(String numeroDeSerie, double capacidadeDoTanqueEmLitros, double capacidadeDeCargaEmKilos, String apelidoCarinhoso) {
		this(numeroDeSerie, capacidadeDoTanqueEmLitros, capacidadeDeCargaEmKilos);
		this.apelidoCarinhoso = apelidoCarinhoso;
	}
	
	public Colheitadeira(String numeroDeSerie, double capacidadeDoTanqueEmLitros, double capacidadeDeCargaEmKilos) {
		this.numeroDeSerie = numeroDeSerie;
		this.capacidadeDeCargaEmKilos = capacidadeDeCargaEmKilos;
		this.capacidadeDoTanqueEmLitros = capacidadeDoTanqueEmLitros;
	}
	
	public String getApelidoCarinhoso() {
		return apelidoCarinhoso;
	}
	public double getCapacidadeDeCargaEmKilos() {
		return capacidadeDeCargaEmKilos;
	}
	public double getCapacidadeDoTanqueEmLitros() {
		return capacidadeDoTanqueEmLitros;
	}
	public String getNumeroDeSerie() {
		return numeroDeSerie;
	}
	public void setApelidoCarinhoso(String novoApelidoCarinhoso) {
		apelidoCarinhoso = novoApelidoCarinhoso;
	}
	
	
	

}
