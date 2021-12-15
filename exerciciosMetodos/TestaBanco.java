package br.com.generation.exerciciosMetodos;

public class TestaBanco {

	public static void main(String[] args) {

		Banco b1 = new Banco();
		
		b1.setNome("Bruna Rodrigues");
		b1.setAgencia("0001");
		b1.setConta("2939-0");
		b1.setSaldo(5000.00);
		
		System.out.println("Nome: " + b1.getNome());
		System.out.println("Agência: " + b1.getAgencia());
		System.out.println("Conta: " + b1.getConta());
		System.out.println("Seu Saldo é de: " + "R$" + b1.getSaldo());

	}

}
