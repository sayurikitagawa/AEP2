package aula20190827.lista_genérica;

public class Lista<TIPO_DO_ELEMENTO> {
	private final int TAMANHO = 100;
	private Object[] elementos = new Object[TAMANHO];
	private int próximo = 0;

	public void adicionar(TIPO_DO_ELEMENTO elemento) {
		if (próximo < TAMANHO) {
			elementos[próximo] = elemento;
			próximo++;
		}
	}

	public int obterQuantidadeDeElementos() {
		return próximo;
	}

	public void imprimirConteúdoNoConsole() {
		for (int contador = 0; contador < próximo; contador++) {
			System.out.println(contador + " ==> " + elementos[contador]);
		}
	}

}
