package br.com.generation.Exercicios.exerciciosMetodos;
/*5) Crie uma classe patinete e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto patinete, 
 * 	 defina as instancias deste objeto e apresente as informações deste objeto no console.
 */ 

import java.util.Scanner;

public class TestaPatinete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Velocidade do Patinete: ");
		int acel = sc.nextInt();
		
		Patinete p1 = new Patinete();
		
		p1.marca1 = "Scooter";
		p1.peso1 = "60Kg";
		p1.velo1 = 0;
		
		System.out.println("Modelo: " + p1.marca1);
		System.out.println("Peso suportado: " + p1.peso1);
		System.out.println("Velocidade inicial: " + p1.velo1);
		
		p1.acelerar(acel);

		System.out.println("Velocidade aumentada: " + p1.velo1);
		
		p1.freiar(10);
		System.out.println("Velocidade reduzida até: " + p1.velo1);
		
		sc.close();

	}


}

