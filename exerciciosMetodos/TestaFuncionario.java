package br.com.generation.Exercicios.exerciciosMetodos;
 /*4) Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto funcion�rio, 
 *    defina as instancias deste objeto e apresente as informa��es deste objeto no console.
 */

public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario func = new Funcionario();
		
		func.setNome("Carlos da Silva Santos");
		func.setCargo("Desenvolvedor Java Jr.");
		func.setSalario(3000.00);
		
		System.out.println("Nome: " + func.getNome());
		System.out.println("Cargo: " + func.getCargo());
		System.out.println("Com s�lario de: " + "R$" + func.getSalario());

	}

}
