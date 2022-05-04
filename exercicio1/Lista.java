package ProvaParcialEstrutDados.exercicio1;

public class Lista {
	No inicio, fim;
	
	// insere um n� no final da lista. Esse m�todo ser� chamado pelo m�todo inserir
	private void inserirFim(No aux) {
		if(inicio == null) {
			inicio = aux;
		} else {
			fim.prox = aux;
		}
		fim = aux;
	}
	
	//esse m�todo dever� ser implementado de acordo com o enunciado do exerc�cio
	private void inserirPrioridade(No aux) {
		boolean achou=false;
		int contador=0;
		No aux2=inicio;

		while(aux2!=null){
			if(aux2.cor.equalsIgnoreCase("amarelo")){
				contador++;
				achou=true;
			}
			aux2=aux2.prox;
		}

		if(inicio==null){
			inserirFim(aux);
		}else if(achou==false){
			aux.prox=inicio;
			inicio=aux;
			
		}else if(achou==true){
			aux2=inicio;
			for(int i=0; i<contador-1; i++){
				aux2=aux2.prox;
			}
			aux.prox=aux2.prox;
			aux2.prox=aux;
		}	
		
	}
	
	// m�todo inserir. Esse m�todo ser� chamado a partir da classe Main
	public void inserir(int numero, String cor) {
		No aux = new No(numero, cor);
		if(cor.equalsIgnoreCase("verde")) {
			inserirFim(aux);
		} else {
			inserirPrioridade(aux);
		}
	}
	
	// m�todo utilizado para imprimir os dados da lista
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.numero);
			aux = aux.prox;
		}
	}
}
