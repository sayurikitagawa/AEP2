package aula20190805.estado_das_instâncias_oo;

public class ContaCorrente {
	private float totalDeSaques;
	private float saldoAtual;
	
	public ContaCorrente(float saldoInicial) {
		saldoAtual = saldoInicial;
	}
	
	public void sacar(float valor) {
		this.totalDeSaques += valor;
		this.saldoAtual -= valor;
	}
	
	public float getSaldoAtual() {
		return saldoAtual;
	}
	

}
 