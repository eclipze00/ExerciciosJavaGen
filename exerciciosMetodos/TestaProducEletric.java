package br.com.generation.Exercicios.exerciciosMetodos;
/*3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta classe, 
 * em seguida crie um objeto produto eletr�nico, 
 * defina as instancias deste objeto e apresente as informa��es deste objeto no console.
 */

public class TestaProducEletric {

	public static void main(String[] args) {
		
		
		ProdutoEle proctE = new ProdutoEle();
		
		proctE.tipo = "TV";
		proctE.marca = "Philco";
		proctE.acao = "Ligar TV";
		
		proctE.tip();
		System.out.println(" Tipo: " + proctE.tipo);
		System.out.println();
		
		proctE.marc();
		System.out.println(" Marca: " + proctE.marca);
		System.out.println();
		
		proctE.act();
		System.out.println(" " + proctE.acao);
		

	}

}
