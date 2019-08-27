package aula20190827.lista_genérica;

import java.util.Date;

public class Aplicação {

	public static void main(String[] args) {
		System.out.println("Oi!");
		Lista<String> nomesDosAlunos = new Lista();
		Lista<Object> nomesDosProfessores = new Lista();	
		nomesDosAlunos.adicionar("Fulano");
		nomesDosProfessores.adicionar("Jogenaldo");
		nomesDosProfessores.adicionar("Anaclesita");
		nomesDosProfessores.adicionar('x');
		nomesDosProfessores.adicionar(100);
		nomesDosProfessores.adicionar(new Date());
		
		System.out.println(nomesDosAlunos.obterQuantidadeDeElementos());
		System.out.println(nomesDosProfessores.obterQuantidadeDeElementos());
		
		nomesDosProfessores.imprimirConteúdoNoConsole();
	}
}
