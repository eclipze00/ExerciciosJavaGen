package br.com.generation.exerciciosMetodos;

import java.util.Scanner;

/*2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
 *   em seguida crie um objeto avião, defina as instancias deste objeto 
 *   e apresente as informações deste objeto no console.
 */

public class TestaAviao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Velocidade do Avião: ");
		int fly = sc.nextInt();

		Aviao a1 = new Aviao();
		
		a1.companhia = "Gol Linhas Aéreas";
		a1.marca = "Boeing 777";
		a1.voar = 0;
		
		System.out.println("Você está viajando pela Companhia: " + a1.companhia);
		System.out.println("O modelo do avião é: " + a1.marca);
		
		System.out.println("O avião ira decolar!");
		
		a1.decolar(fly);
		
		System.out.println("O avião ira decolar após atingir " + a1.voar + " nós");
		
		a1.pousar(12);
		System.out.println("O avião ira pousar após atingir " + a1.voar + " nós");
		
		sc.close();
	}

}
