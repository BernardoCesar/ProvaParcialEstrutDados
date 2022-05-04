package ProvaParcialEstrutDados.exercicio4;

public class Main {
	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		// inser��o dos elementos na lista
		lista.inserir(0);
		lista.inserir(-1);
		lista.inserir(-2);	
		lista.inserir(5);
		lista.inserir(6);
		
		lista.inserir(3);
		lista.inserir(37);
		lista.inserir(-78);

		lista.inserir(177);
		lista.inserir(2);
		lista.inserir(25);
		lista.inserir(25);


		// impress�o dos elementos da lista
		lista.imprimir();

	}
}
