package br.com.generation.Exercicios.exerciciosMetodos;
/*4) Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto funcion�rio, 
 *   defina as instancias deste objeto e apresente as informa��es deste objeto no console.
 */

public class Funcionario {
	
	String nome;
	String cargo;
	double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
		

}
