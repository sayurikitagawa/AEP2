package aula20190812.cofre_finalizado;

public class Cofre {
	
	//- <<final>> SEM_SENHA : int = -1
	private static final int SEM_SENHA = -1;
	//- aberto : boolean = true
	private boolean aberto = true;
	//- senha : int = -1
	private int senha = SEM_SENHA;
	
	//+ abrir(senha : int) : void
	public void abrir(int senha) {
		if (aberto) {
			throw new RuntimeException("O cofre já está aberto! Oxe...");
		}
		if (!aberto && this.senha == senha)  {
			aberto = true;
			this.senha = SEM_SENHA;
		}
	}
	
	//+ fechar(senha : int) : void
	public void fechar(int senha) {
		if (!aberto) {
			throw new RuntimeException("O cofre já está fechado! :D");
		}
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
