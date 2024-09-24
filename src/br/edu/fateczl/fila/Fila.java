package br.edu.fateczl.fila;

public class Fila<T> {
	
	Node<T> inicio;
	Node<T> fim;
	
	public boolean isEmpty() {
		if (inicio == null && fim == null) {
			return true;
		}
		return false;
	}
	
	public void insert(T valor) {
		Node<T> elemento = new Node<>();
		elemento.dado = valor;
		elemento.proximo = null;
		if (isEmpty()) {
			inicio = elemento;
			fim = inicio;
		} else {
			fim.proximo = elemento;
			fim = elemento;
		}
	}
	
	public T remove() throws Exception {
		if (isEmpty()) {
			throw new Exception("Não há elementos na fila");
		}
		
		T valor = inicio.dado;
		if (inicio == fim && inicio != null) {
			inicio = null;
			fim = inicio;
		} else {
			inicio = inicio.proximo;
		}
		return valor;
	}
	
	public void list() throws Exception {
		if (isEmpty()) {
			throw new Exception("Não há elementos na fila");
		}
		Node<T> auxiliar = inicio;
		while (auxiliar != null) {
			System.out.print(auxiliar.dado + "; ");
			auxiliar = auxiliar.proximo;
		}
		System.out.print("\n");
	}
	
	public int size() {
		int tamanho = 0;
		if (!isEmpty()) {
			Node<T> auxiliar = inicio;
			while (auxiliar != null) {
				tamanho++;
				auxiliar = auxiliar.proximo;
			}
		}
		return tamanho;
	}

}
