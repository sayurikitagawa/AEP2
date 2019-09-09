package AEP.conceito;

import java.util.ArrayList;
import java.util.List;

public class App {
	 public static void main(String[] args) {
    List<Avaliação> avaliações = new ArrayList<Avaliação>();
	Avaliação BancoDados=new Avaliação("Banco de Dados II");
	Avaliação Estatística=new Avaliação ("Estatística");
	Avaliação Algoritmo=new Avaliação("Algoritmo");
	avaliações.add(BancoDados);
	avaliações.add(Estatística);
	avaliações.add(Algoritmo);

	List<Aluno> alunos=new ArrayList<Aluno>();
	
	Aluno Eliza=new Aluno("Eliza Castanho", "119ABC");
	alunos.add(Eliza);
	Eliza.adicionarAvaliação(BancoDados); 
	Eliza.adicionarAvaliação(Estatística);
    Eliza.setNota(5);
    Eliza.setNota(10);
    Aluno sayuri=new Aluno("Sayuri","18061222");
    Aluno renata=new Aluno("Renata","1522220");
    alunos.add(sayuri);
    alunos.add(renata);
    sayuri.adicionarAvaliação(Algoritmo);
    sayuri.adicionarAvaliação(BancoDados);
    sayuri.setNota(6);
    sayuri.setNota(8);
    renata.adicionarAvaliação(Algoritmo);
    renata.adicionarAvaliação(BancoDados);
    renata.setNota(3);
    renata.setNota(5);
    listarAlunos(alunos);
    médiaAlunos(alunos);

}  
public static void listarAlunos(List<Aluno> alunos) {
	for(Aluno a: alunos) {
		int contador=0;
		System.out.println("--------------------------------");
		System.out.println("Nome: "+a.getNome());
		System.out.println("Id: "+a.getId());
		for(Avaliação l:a.getAvaliações()) {
				System.out.println("Avaliação: " +l.getAvaliação()+ " -- Nota: "+a.getNota(contador));
				contador++;
		}
	}
}
 
 public static void listarAvaliações(List<Avaliação> avaliações) {
	  for(Avaliação l:avaliações) {
		  System.out.println("Avaliação: "+l.getAvaliação());
	  }
	
 }
 
public static void médiaAlunos(List<Aluno> alunos) {
	 float média=0;
	 int contadorAlunos=0;
	for(Aluno a: alunos) {
		 for(int contador=0;contador<=a.getNota(a.tamanho());contador++) {
			  média+=a.getNota(contador);
		 }
		 contadorAlunos++;
	 }
	
	System.out.println("Média das notas dos alunos: "+média/contadorAlunos );
 }
}
 