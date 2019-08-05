#include <iostream>

typedef struct ContaCorrente {
	float saldoAtual = 0.00f;
	float totalDeSaques = 0.00f;
} ContaCorrente;

void sacar(ContaCorrente* cc, float valor);

int main(int argc, char** argv) {
	ContaCorrente* cc01 = new ContaCorrente;
	cc01->saldoAtual = 100.00f;

	sacar(cc01, 20.00f);
	
	cc01->saldoAtual = -999.00f;
	
	printf("%f", cc01->saldoAtual);
	
	return 0;
}

void sacar(ContaCorrente* cc, float valor) {
	cc->totalDeSaques += valor;
	cc->saldoAtual -= valor;
}
