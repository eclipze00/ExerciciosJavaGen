package br.com.generation.Exercicios.exerciciosMetodos;

	/*2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
	 *   em seguida crie um objeto avião, defina as instancias deste objeto 
	 *   e apresente as informações deste objeto no console.
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
