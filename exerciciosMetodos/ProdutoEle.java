package br.com.generation.Exercicios.exerciciosMetodos;
    /*3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta classe, 
	 * em seguida crie um objeto produto eletr�nico, 
	 * defina as instancias deste objeto e apresente as informa��es deste objeto no console.
	 */

public class ProdutoEle {
	
	String tipo;
	String marca; 
	
	String acao;
	
	void tip() {
		System.out.println("|=========================|");
		System.out.println("| Qual o tipo de produto: |");
		System.out.println("|=========================|");
	}
	void marc() {
		System.out.println("|=========================|");
		System.out.println("|Qual a marca de produto: |");
		System.out.println("|=========================|");
	}
	void act() {
		System.out.println("|=========================|");
		System.out.println("| Ligar/Desligar produto: |");
		System.out.println("|=========================|");
	}

}
