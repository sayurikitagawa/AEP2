package aula20190805.estado_das_instâncias_estruturado;

public class App {
	
	public static void main(String[] args) {
		ContaCorrente cc01 = new ContaCorrente();
		cc01.saldoAtual = 100.00f;
		
		sacar(cc01, 20.00f);
		System.out.println(cc01.saldoAtual);
	}
	public static void sacar(ContaCorrente cc, float valor) {
		cc.totalDeSaques += valor;
		cc.saldoAtual -= valor;
	}

}
