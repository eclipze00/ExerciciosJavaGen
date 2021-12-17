package br.com.generation.Exercicios.exerciciosJava;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		double r, s, d;
		
		System.out.println("Entre com o valor de A: ");
		a = leia.nextInt();
		System.out.println("Entre com o valor de B: ");
		b = leia.nextInt();
		System.out.println("Entre com o valor de C: ");
		c = leia.nextInt();
		
		r = Math.pow((a + b), 2);
		s = Math.pow((b + c), 2);
		
		d = (r + s) / 2;
		
		
		System.out.println("O valor de D foi de " + d);
		

	}

}
