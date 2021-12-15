package br.com.generation.exerciciosHeranca;

public class TestAni {

	public static void main(String[] args) {

		Cachorro dog = new Cachorro();
		
		dog.setNome("Junin");
		dog.setIdade(2);
		dog.setSom("Latido");
		dog.setCorrer("Corre!");
		
		System.out.println("Nome: " + dog.getNome());
		System.out.println("Idade: " + dog.getIdade() + " anos");
		System.out.println("Qual tipo de som o animal emite: " + dog.getSom());
		System.out.println("O animal corre: " + dog.getCorrer());
		System.out.println();
		
		Cavalo horse = new Cavalo();
		
		horse.setNome("Pé de Pano");
		horse.setIdade(5);
		horse.setSom("Relinchar");
		horse.setCorrer("Corre!");
		
		System.out.println("Nome: " + horse.getNome());
		System.out.println("Idade: " + horse.getIdade() + " anos");
		System.out.println("Qual tipo de som o animal emite: " + horse.getSom());
		System.out.println("O animal corre: " + horse.getCorrer());
		System.out.println();
		
		Preguica pre = new Preguica();
		
		pre.setNome("Preguiçinha");
		pre.setIdade(1);
		pre.setSom("Desconhecido!");
		pre.setSubirArv("Ela sobe em árvores!");
		
		System.out.println("Nome: " + pre.getNome());
		System.out.println("Idade: " + pre.getIdade() + " ano");
		System.out.println("Qual tipo de som o animal emite: " + pre.getSom());
		System.out.println("O animal sobe em árvores: " + pre.getSubirArv());
		System.out.println();
		

	}

}
