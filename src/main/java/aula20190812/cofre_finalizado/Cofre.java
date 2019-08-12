package aula20190812.cofre_finalizado;

public class Cofre {
	//- aberto : boolean = true
	private boolean aberto = true;
	//- senha : int = -1
	private int senha = -1;
	
	//+ abrir(senha : int) : void
	public void abrir(int senha) {
		if (!aberto && this.senha == senha)  {
			aberto = true;
			this.senha = -1;
		}
	}
	
	//+ fechar(senha : int) : void
	public void fechar(int senha) {
		if (aberto) {
			aberto = false;
			this.senha = senha;
		}
	}
	
	//+ estáAberto() : boolean
	public boolean estáAberto() {
		/*
		if (aberto) {
			return true;
		} else {
			return false;
		}
		*/
		return aberto;
	}
	

}
