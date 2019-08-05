package aula20190729.lista;

public class ListaDeString {
	//Atributos da instância, ou seja, campos dos objetos do tipo ListaDeString
	//final equivale a const em C (constante)
	private final int TAMANHO = 100;
	private String[] arrayDeStrings = new String[TAMANHO];
	private int próximo = 0;
	
	public void adicionar(String elemento) {		
		if (próximo < TAMANHO) {
			arrayDeStrings[próximo] = elemento;
			próximo++;
		}
	}
	
	public int obterQuantidadeDeElementos() {
		return próximo;
	}

}
