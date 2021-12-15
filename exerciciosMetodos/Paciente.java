package br.com.generation.exerciciosMetodos;
/*7) Crie uma classe paciente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto paciente,
 *   defina as instancias deste objeto e apresente as informações deste objeto no console.
 */

public class Paciente {
	
	String nome;
	String nasc;
	String endereco;
	
	String remedio;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNasc() {
		return nasc;
	}

	public void setNasc(String nasc) {
		this.nasc = nasc;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getRemedio() {
		return remedio;
	}

	public void setRemedio(String remedio) {
		this.remedio = remedio;
	}
	
	

}
