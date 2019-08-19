package aula20190819.pessoa;

public class Pessoa {
	//Atributo privado, de instância, chamado "nome", do tipo String.
	//private String nome;
	
	//Atributo privado, de CLASSE, chamado "nome", do tipo String.
	private static String nome;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

}
