package br.edu.fateczl.fila;

public class Node<T> {

	T dado;
	Node<T> proximo;
	
	@Override
	public String toString() {
		return "Node [" + dado + "]";
	}
}
