package ProvaParcialEstrutDados.exercicio1;

public class Main {
	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		// inser��o de objetos na lista
		lista.inserir(12, "verde");
		lista.inserir(13, "verde");

		lista.inserir(5, "amarelo");
		lista.inserir(6, "amarelo");
		lista.inserir(7, "amarelo");
		lista.inserir(12, "verde");

		lista.inserir(8, "amarelo");
	
		// impress�o dos objetos inseridos na lista
		lista.imprimir();

	}
}
