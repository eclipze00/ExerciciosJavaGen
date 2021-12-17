package br.com.generation.Exercicios.exerciciosMetodos;
    /*3) Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, 
	 * em seguida crie um objeto produto eletrônico, 
	 * defina as instancias deste objeto e apresente as informações deste objeto no console.
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
