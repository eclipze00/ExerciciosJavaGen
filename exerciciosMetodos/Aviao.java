package br.com.generation.Exercicios.exerciciosMetodos;

	/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, 
	 *   em seguida crie um objeto avi�o, defina as instancias deste objeto 
	 *   e apresente as informa��es deste objeto no console.
	 */

public class Aviao {
	
	String companhia;
	String marca;
	int voar;
	
	void decolar(int decolagem) {
		voar = voar + decolagem;
	}
	void pousar(int pousando) {
		voar = voar - pousando;
	}

}
