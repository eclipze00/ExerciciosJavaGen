package br.com.generation.exerciciosMetodos;

	/*1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
	 * em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as 
	 * informações deste objeto no console.
	 */

public class Cliente {
	
	String nome;
	String compra;
	int idade;

	void escrever() {
		System.out.println("|========================================|");
		System.out.println("|Sua compra está perto de ser finalizada!|");
		System.out.println("|========================================|");
	}
	
	void finalizarCompra() {
		System.out.println("|=========================|");
		System.out.println("|Sua compra foi finalizada|");
		System.out.println("|=========================|");
	}
}
