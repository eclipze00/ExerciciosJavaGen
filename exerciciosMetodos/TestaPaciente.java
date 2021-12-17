package br.com.generation.Exercicios.exerciciosMetodos;

public class TestaPaciente {

	public static void main(String[] args) {

		Paciente p2 = new Paciente();
		
		p2.setNome("Brenda Oliveira");
		p2.setNasc("23/03/1997");
		p2.setEndereco("Rua: Turim N° 333");
		p2.setRemedio("Tomar Cataflan por 3 dias");
		
		System.out.println("Nome do Paciente: " + p2.getNome());
		System.out.println("Data de Nascimento: " + p2.getNasc());
		System.out.println("Endereço: " + p2.getEndereco());
		System.out.println("Prescrição: " + p2.getRemedio());

	}

}
