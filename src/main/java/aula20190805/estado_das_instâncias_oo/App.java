package aula20190805.estado_das_instâncias_oo;

public class App {
	
	public static void main(String[] args) {
		ContaCorrente cc01 = new ContaCorrente(100.00f);

		cc01.sacar(20.00f);		
		
		//Não é permitido! O encapsulamento do saldoAtual 
		//impede a atribuição externa direta! :D
		//cc01.sadoAtual = -999.00f;
		System.out.println(cc01.getSaldoAtual());		
	}
}
