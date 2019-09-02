package aula20190902.mais_coleções.fazenda;

public class Fazenda {
	//nome
	private final String nome;
	
	//área em hectares
	private final double areaEmHectares;
	
	//valor de mercado
	private double valorDeMercado;
	
	public Fazenda(String nome, double areaEmHectares, double valorDeMercado) {
		if (nome == null || nome.trim().length()==0) {
			throw new RuntimeException("Nome não pode ser nulo nem vazio!");
		}
		if (areaEmHectares <= 0) {
			throw new RuntimeException("Área deve ser maior que zero!");
		}
		if (valorDeMercado <= 0) {
			throw new RuntimeException("Valor de mercado deve ser maior que zero!");
		}
		this.nome = nome;
		this.areaEmHectares = areaEmHectares;
		this.valorDeMercado = valorDeMercado;
	}	
	public void setValorDeMercado(double valorDeMercado) {
		this.valorDeMercado = valorDeMercado;
	}
	public double getValorDeMercado() {		
		return valorDeMercado;
	}
	public String getNome() {
		return nome;
	}
	public double getAreaEmHectares() {
		//double areaEmHectares = 0.00;
		return areaEmHectares;
	}
}
