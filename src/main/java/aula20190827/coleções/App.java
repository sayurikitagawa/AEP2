package aula20190827.coleções;

public class App {
	
	public static void main(String[] args) {	
		imprimirConteúdoDoArrayNoConsole(args);
		
		String[] nomes = {"Ana","Luíza","Jonas","Márcia","Joaquim"};
		imprimirConteúdoDoArrayNoConsole(nomes);
		
		
		Integer[] idades = {33, 44, 11, 22, 27, 17, 18, 19, 21};
		imprimirConteúdoDoArrayNoConsole(idades);
		
		System.out.println("Fim.");		
	}
	private static void imprimirConteúdoDoArrayNoConsole(Object[] array) {
		for (int contador = 0; contador < array.length; contador++) {
			System.out.println(contador + " ==> " + array[contador]);
		}
	}
	/*
	private static void imprimirConteúdoDoArrayNoConsole(String[] array) {
		for (int contador = 0; contador < array.length; contador++) {
			System.out.println(contador + " ==> " + array[contador]);
		}
	}
	private static void imprimirConteúdoDoArrayNoConsole(Integer[] array) {
		for (int contador = 0; contador < array.length; contador++) {
			System.out.println(contador + " ==> " + array[contador]);
		}
	}
	*/
	

}
