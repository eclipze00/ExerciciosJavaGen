package br.com.generation.Exercicios.exerciciosMetodos;
/*4) Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto funcionário, 
 *   defina as instancias deste objeto e apresente as informações deste objeto no console.
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
