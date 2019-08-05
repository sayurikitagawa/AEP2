package aula20190729.lista;

public class Aplicação {

	public static void main(String[] args) {
		System.out.println("Oi!");
		//1º declaração da variável "nomes" do tipo ListaDeNomes.
		//2º criação de uma nova instância de ListaDeNomes 
		//   via operador "new" que chama o construtor ListaDeNomes().
		//3º Atribuição do endereço da nova instância para a variável "nomes", ou seja,
		//   nomes é uma referência para um objeto (equivalente a um ponteiro).
		ListaDeString nomesDosAlunos = new ListaDeString();
		//adicionar("Fulano",nomesDosAlunos);
		ListaDeString nomesDosProfessores = new ListaDeString();
		//adicionar("Jogenaldo",nomesDosProfessores);
		//adicionar("Anaclesita",nomesDosProfessores);
		
		nomesDosAlunos.adicionar("Fulano");
		nomesDosProfessores.adicionar("Jogenaldo");
		nomesDosProfessores.adicionar("Anaclesita");
		
		//System.out.println(nomesDosAlunos.próximo);
		//System.out.println(nomesDosProfessores.próximo);
		System.out.println(nomesDosAlunos.obterQuantidadeDeElementos());
		System.out.println(nomesDosProfessores.obterQuantidadeDeElementos());
	}
}
