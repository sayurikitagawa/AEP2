package aula20190812.cofre_finalizado;

public class App {
	
	//+ main(args : String[]) : void
	public static void main(String[] args) {
		Cofre cofreDaSala = new Cofre();
		Cofre cofreDaCozinha = new Cofre();
		
		cofreDaSala.fechar(4321);
		cofreDaCozinha.fechar(5555);
		
		exibirStatus(cofreDaSala, cofreDaCozinha);
		
		cofreDaCozinha.abrir(5555);
		
		exibirStatus(cofreDaSala, cofreDaCozinha);

	}
	
	//+ exibirStatus(cofre1 : Cofre, cofre2 : Cofre) : void
	public static void exibirStatus(Cofre cofre1, Cofre cofre2) {
		System.out.println("Cofre1 está aberto? " + cofre1.estáAberto());
		System.out.println("Cofre2 está aberto? " + cofre2.estáAberto());
	}

}
