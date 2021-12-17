package br.com.generation.Exercicios.exerciciosHeranca_Polimor;

public class Preguica02 extends Cavalo02 implements Ani01 {

	public Preguica02(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void somAnimal() {
		System.out.println("Som Desconhecido!");
		
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subirArv() {
		System.out.println("Ele sobe em árvores!");
		
	}

}
