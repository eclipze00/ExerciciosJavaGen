package br.com.generation.Exercicios.exerciciosHeranca_Polimor;

public class TestaAnimal02Inter {

	public static void main(String[] args) {

		
		Cachorro02 dog2 = new Cachorro02(null, 0);
		dog2.setNome("Junin");
		dog2.setIdade(3);
		System.out.println("O nome do cachorro é: " + dog2.getNome());
		System.out.println("A idade do cachorro é: " + dog2.getIdade());	
		dog2.somAnimal();
		dog2.correr();
		
		System.out.println();
		
		Cavalo02 cav2 = new Cavalo02(null, 0);
		cav2.setNome("Marquin");
		cav2.setIdade(6);
		System.out.println("O nome do Cavalo é: " + cav2.getNome());
		System.out.println("A idade do Cavalor é: " + cav2.getIdade());	
		cav2.somAnimal();
		cav2.correr();
		
		System.out.println();
		
		Preguica02 pre2 = new Preguica02(null, 0);
		pre2.setNome("Flash");
		pre2.setIdade(10);
		System.out.println("O nome da Preguiça é: " + pre2.getNome());
		System.out.println("A idade da Preguiça é: " + pre2.getIdade());	
		pre2.somAnimal();
		pre2.subirArv();

	}

}
