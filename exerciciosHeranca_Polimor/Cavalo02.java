package br.com.generation.Exercicios.exerciciosHeranca_Polimor;

public class Cavalo02 extends Cachorro02 implements Ani01 {
	
	
	

	public Cavalo02(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void somAnimal() {
		System.out.println("O cavalo Relincha");
		
	}

	@Override
	public void correr() {
		System.out.println("O cavalo corre bastante!");
		
	}

	@Override
	public void subirArv() {
		// TODO Auto-generated method stub
		
	}

	
	}


