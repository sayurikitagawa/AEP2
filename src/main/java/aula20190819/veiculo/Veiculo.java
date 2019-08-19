package aula20190819.veiculo;

public class Veiculo {
	private double capacidadeDoTanque;
	private double volumeNoTanque;
	private static final double CONSUMO_AO_LIGAR = 0.1;
	private static final double CONSUMO_AO_ACELERAR = 0.5;
	private boolean ligado = false;

	
	private void lançarExceçãoSeValorMenorQue(double valor, double limite, String mensagem) {
		if (valor <= limite) {
			throw new RuntimeException(mensagem);
		}
	}
	private void lançarExceçãoSeLigado(String mensagem) {
		if (ligado) {
			throw new RuntimeException(mensagem);
		}
	}
	private void lançarExceçãoSeNãoLigado(String mensagem) {
		if (!ligado) {
			throw new RuntimeException(mensagem);
		}		
	}
	public Veiculo(double capacidadeDoTanque) {
		lançarExceçãoSeValorMenorQue(capacidadeDoTanque, 0.00, "A capacidade do tanque deve ser maior que zero!");
		this.capacidadeDoTanque = capacidadeDoTanque;
	}

	public void abastecer(double volumeAbastecido) {		
		lançarExceçãoSeValorMenorQue(capacidadeDoTanque, 0.00,"O volume abastecido deve ser maior que zero!");
		lançarExceçãoSeLigado("Perigo! Nunca abasteça seu veículo ligado! Desligue primeiro!"); 
		if (volumeNoTanque + volumeAbastecido > capacidadeDoTanque) {
			throw new RuntimeException("Capacidade do tanque excedida! Máximo de " + capacidadeDoTanque + " litros.");
		}
		volumeNoTanque += volumeAbastecido;
	}

	public void ligar() {
		lançarExceçãoSeLigado("Não é possível ligar um veículo já ligado. Desligue primeiro!");
		lançarExceçãoSeValorMenorQue(volumeNoTanque, 0.00, "Não é possível ligar o veículo sem combustível! Abasteça primeiro... :D");
		ligado = true;
		volumeNoTanque -= CONSUMO_AO_LIGAR;
	}

	public void acelerar() {
		if (!ligado) {
			throw new RuntimeException("Não é possível acelerar um veículo desligado! Ligue primeiro.");
		}
		if (volumeNoTanque - CONSUMO_AO_ACELERAR <= 0.00) {
			volumeNoTanque = 0.00;
			desligar();
		} else if (volumeNoTanque > CONSUMO_AO_ACELERAR) {
			volumeNoTanque -= CONSUMO_AO_ACELERAR;
		}
	}

	public double getVolumeNoTanque() {
		return volumeNoTanque;
	}

	public void desligar() {
		lançarExceçãoSeNãoLigado("Não é possível desligar um veículo já desligado! Ligue primeiro!");
		ligado = false;
	}

}


 