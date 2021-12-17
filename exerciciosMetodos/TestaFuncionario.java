package br.com.generation.Exercicios.exerciciosMetodos;
 /*4) Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto funcionário, 
 *    defina as instancias deste objeto e apresente as informações deste objeto no console.
 */

public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario func = new Funcionario();
		
		func.setNome("Carlos da Silva Santos");
		func.setCargo("Desenvolvedor Java Jr.");
		func.setSalario(3000.00);
		
		System.out.println("Nome: " + func.getNome());
		System.out.println("Cargo: " + func.getCargo());
		System.out.println("Com sálario de: " + "R$" + func.getSalario());

	}

}
