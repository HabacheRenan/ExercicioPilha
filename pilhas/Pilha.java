package pilhas;

public class Pilha {
	No topo;
	
	Pilha() {
		topo = null;
	}
	
	boolean isEmpty() {
		if (topo == null) {
			return true;
		}
		return false;
	}
	
	void push(int valor) {
		No elemento = new No();
		elemento.dado = valor;
		elemento.proximo = topo;
		topo = elemento;
	}

	int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("pilha vazia");
		}
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	int top() throws Exception{
		if(isEmpty()) {
			throw new Exception("pilha vazia");
		}
		return topo.dado;
	}
	
	int size() {

		if(isEmpty() == false) {
			No auxiliar = topo;
			int cont = 1;
			
				while(auxiliar.proximo != null) {
					auxiliar = auxiliar.proximo;
					cont++;
				}
			return cont;
		}
		return 0;
	}
}
