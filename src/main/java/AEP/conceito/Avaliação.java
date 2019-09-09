package AEP.conceito;

public class Avaliação {
  private String avaliação;

public Avaliação(String avaliação) {
	if(avaliação==null || avaliação.trim().length()==0) {
		throw new RuntimeException("Avaliação não pode ser nula nem vazia!");
	}
	this.avaliação = avaliação;
}

public String getAvaliação() {
	return avaliação;
}

public void setAvaliação(String avaliação) {
	this.avaliação = avaliação;
}
  

  
}
