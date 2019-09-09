package AEP.conceito;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
  private final String nome;
  private final String id;
  private float[] nota=new float[50];
  private List<Avaliação> avaliações=new ArrayList<Avaliação>();
  private int posição=0;
  
  public float getNota(int posição) {
	return nota[posição];
}
  
public void adicionarNotaPosição(int posição,float nota) {
	this.nota[posição]=nota;
}

public void setNota(float nota) {
 if(nota<0 || nota>10) {
		throw new RuntimeException("Não é permitido nota menor que 0 ou maior que 10");
	}
	this.nota[posição] = nota;
    posição++;
}

public Aluno(String nome, String id) {
	  if (nome == null || nome.trim().length()==0) {
			throw new RuntimeException("Nome não pode ser nulo nem vazio!");
		}
		if (id==null || id.trim().length()==0) {
			throw new RuntimeException("Id não pode ser nulo nem vazio!");
		}
	  
	  this.nome = nome;
		this.id = id;
	}

public int tamanho() {
	return posição;
}
public void adicionarAvaliação(Avaliação avaliação) {
	 avaliações.add(avaliação);
 }

public List<Avaliação> getAvaliações() {
	return avaliações;
}

public void setAvaliações(List<Avaliação> avaliações) {
	this.avaliações = avaliações;
}

public String getNome() {
	return nome;
}
public String getId() {
	return id;
}
  
public void atingirAMédiaNaAvaliação() {
	int cont=0;
	 for(Avaliação av: this.getAvaliações()) {
		 if(this.getNota(cont)>=6) {
			   System.out.println("Avaliação: "+av.getAvaliação() + " Nota: "+getNota(cont)+" -- Acima da média ");
		 }
		 else{
			   System.out.println("Avaliação: "+av.getAvaliação() + " Nota: "+getNota(cont)+" -- Abaixo da média");

		 }
		 cont++;
	  }	
}

public void statusAluno() {
	int cont=0;
	System.out.println("-----------------------------------");
	System.out.println("Aluno(a): "+getNome());
	System.out.println("Id: "+getId());
	for(Avaliação av: this.getAvaliações()) {
		System.out.println("Avaliação: "+av.getAvaliação() +" Nota: "+ getNota(cont));
		cont++;
	}
}

}