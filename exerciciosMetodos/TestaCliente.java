package br.com.generation.exerciciosMetodos;

/*1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as 
 * informações deste objeto no console.
 */

public class TestaCliente {

	public static void main(String[] args) {

		Cliente c1 = new Cliente();
		
		c1.nome = "Antonio";
		c1.idade = 27;
		c1.compra = "Cliente comprou um produto!";
	
		System.out.println("Nome do Cliente: " + c1.nome);
		System.out.println("Idade: " + c1.idade);
		System.out.println(c1.compra);
		System.out.println();
		c1.escrever();
		System.out.println();
		c1.finalizarCompra();

	}

}
