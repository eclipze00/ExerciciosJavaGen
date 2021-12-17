package br.com.generation.exerciciosHeranca_Polimor;

public class Cachorro02 extends Ani02 implements Ani01{

	public Cachorro02(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
				
	}

	@Override
	public void somAnimal() {
		System.out.println("O cachorro Late!");
		
	}

	@Override
	public void correr() {
		System.out.println("O cachorro corre!");
		
	}

	@Override
	public void subirArv() {
		// TODO Auto-generated method stub
		
	}
	
}
